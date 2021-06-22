package mall.controller;

import com.alibaba.fastjson.JSONObject;
import mall.base.*;
import mall.entity.UserInfo;
import mall.entity.UserToken;
import mall.entity.WxLoginInfo;
import mall.entity.mall.MallUser;
import mall.mapper.mall.MallUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author elmer
 * @date 2021/6/10 16:07
 */
@RestController
public class MallWxController {

    @Autowired
    MallUserMapper userMapper;


    @RequestMapping("loginWx")
    public Object loginByWeixin(@RequestBody WxLoginInfo wxLoginInfo, HttpServletRequest request) {
        String code = wxLoginInfo.getCode();
        UserInfo userInfo = wxLoginInfo.getUserInfo();
        if (code == null || userInfo == null) {
            return ResponseUtil.badArgument();
        }

        Integer shareUserId = wxLoginInfo.getShareUserId();
        String sessionKey = null;
        String openId = null;
        try {
            String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wxc89dfd93373e0cfd&secret=2084d2c4b8b8e28e00b8f64e2d5df881&grant_type=authorization_code&js_code=";
            String str = BaseUtil.doGet(url+code);
            JSONObject json = JSONObject.parseObject(str);
//            WxMaJscode2SessionResult result = this.wxService.getUserService().getSessionInfo(code);
//            sessionKey = result.getSessionKey();
//            openId = result.getOpenid();
            sessionKey = json.getString("session_key");
            openId = json.getString("openid");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (sessionKey == null || openId == null) {
            System.out.println("微信登录,调用官方接口失败：{}"+code);
            return ResponseUtil.fail();
        }
        MallUser user = userMapper.selectByOpenId(openId);
        if (user == null) {
            user = new MallUser();
            user.setUsername(openId);
            user.setPassword(openId);
            user.setWxOpenid(openId);
            user.setAvatar(userInfo.getAvatarUrl());
            user.setNickname(userInfo.getNickName());
            user.setGender(userInfo.getGender());
            user.setUserLevel((byte) 0);
            user.setStatus((byte) 0);
            user.setLastLoginTime(new Date());
            user.setLastLoginIp(IpUtil.client(request));
            user.setShareUserId(shareUserId);
            userMapper.insert(user);
            // 新用户发送注册优惠券
//            couponAssignService.assignForRegister(user.getId());
        } else {
            user.setLastLoginTime(new Date());
            user.setLastLoginIp(IpUtil.client(request));
            if (userMapper.updateByPrimaryKey(user) == 0) {
                return ResponseUtil.updatedDataFailed();
            }
        }
        // token
        UserToken userToken = null;
        try {
            userToken = UserTokenManager.generateToken(user.getId());
        } catch (Exception e) {
            System.out.println("微信登录失败,生成token失败：{}"+ user.getId());
            e.printStackTrace();
            return ResponseUtil.fail();
        }
        userToken.setSessionKey(sessionKey);

        Map<Object, Object> result = new HashMap<Object, Object>();
        result.put("token", userToken.getToken());
        result.put("tokenExpire", userToken.getExpireTime().toString());
        userInfo.setUserId(user.getId());
        if (!StringUtils.isEmpty(user.getMobile())) {// 手机号存在则设置
            userInfo.setPhone(user.getMobile());
        }
        try {
            String registerDate = DateTimeFormatter.ofPattern("yyyy-MM-dd")
                    .format(user.getAddTime() != null ? user.getAddTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime() : LocalDateTime.now());
            userInfo.setRegisterDate(registerDate);
            userInfo.setStatus(user.getStatus());
            userInfo.setUserLevel(user.getUserLevel());// 用户层级
            userInfo.setUserLevelDesc(UserTypeEnum.getInstance(user.getUserLevel()).getDesc());// 用户层级描述
        } catch (Exception e) {
            System.out.println("微信登录：设置用户指定信息出错："+e.getMessage());
            e.printStackTrace();
        }
        result.put("userInfo", userInfo);
        return ResponseUtil.ok(result);
    }
}
