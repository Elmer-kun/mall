package mall.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import mall.base.BaseUtil;
import mall.entity.*;
import mall.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class WxController {

    @Autowired
    private MoodModelService modelService;

    @Autowired
    private MoodTextService moodTextService;

    @Autowired
    private TextLinkMoodService textLinkMoodService;

    @Autowired
    private LinkUserService linkUserService;

    @Autowired
    private LinkKidingService linkKidingService;

    @Autowired
    private ClockTextService clockTextService;

    @Autowired
    private UserClockService userClockService;

    @RequestMapping("/textSubmit")
    public Object textSubmit(){
        JSONObject json = new JSONObject();
        json.put("mood", textLinkMoodService.selectRand().getMood());
        json.put("text", linkUserService.getHis());
        return json;
    }

    @RequestMapping("/getOpenid")
    public Object Hello(){
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wxc89dfd93373e0cfd&secret=2084d2c4b8b8e28e00b8f64e2d5df881&grant_type=authorization_code&js_code=";
        JSONObject ret = new JSONObject();
        try {
            String str = BaseUtil.doGet(url);
            JSONObject json = JSONObject.parseObject(str);
            //获取会话密钥（session_key）
            //String session_key = json.get("session_key").toString();
            //用户的唯一标识（openid）
            if((int)json.get("errcode") == 0){
               ret.put("userid", json.get("openid"));
            }
            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ret;
    }

    @RequestMapping("getSentence")
    public Object getSentence(){
        JSONObject json = new JSONObject();
        json.put("sen", linkKidingService.getRand().getText());
        return  json;
    }

    @RequestMapping("getmoodmodel")
    public Object getMoodModel(){
        JSONObject json = new JSONObject();
        json.put("moodlist", modelService.findAll());
        return  json;
    }

    @RequestMapping("getmoodlist")
    public Object getMoodList(String name){
        JSONObject json = new JSONObject();
        json.put("moodlist", moodTextService.findText(name));
        return  json;
    }

    @RequestMapping("collectmood")
    public Object collectMood(String text, String mood){
        JSONObject json = new JSONObject();
        json.put("text", "sucess");
        TextLinkMood textMood = new TextLinkMood();
        textMood.setText(text);
        textMood.setMood(mood);
        textMood.setCreateDate(new Date());
        textLinkMoodService.add(textMood);
        return  json;
    }

    @RequestMapping("posttext")
    public Object PostText(String userid, String name, String textinput){
        JSONObject json = new JSONObject();
        LinkUser user = new LinkUser();
        user.setUserId(userid);
        user.setUserName(name);
        user.setText(textinput);
        user.setCreateDate(new Date());
        linkUserService.add(user);
        TextLinkMood mood = textLinkMoodService.selectRand();
        json.put("text", linkUserService.getUserHis(userid));
        json.put("mood", mood.getMood());
        return  json;
    }

    @RequestMapping("optClock")
    public Object optClock(String opt, String uid, String name, String text, String id){
        JSONObject json = new JSONObject();
        json.put("text", "n");
        switch (opt){
            case "se":
                if(uid != null){
                    List<ClockText> textList = clockTextService.findClock(uid);
                    List<String> texts = new ArrayList<>();
                    List<Integer> ids = new ArrayList<>();
                    for(ClockText clock: textList){
                        texts.add(clock.getClockInfo());
                        ids.add(clock.getId());
                    }
                    json.put("text", texts);
                    json.put("ids", ids);
                }
                break;
            case "up":
                clockTextService.updateById(Integer.valueOf(id), text);
                json.put("text", "ok");
                break;
            case "del":
                clockTextService.delById(Integer.valueOf(id));
                json.put("text", "ok");
                break;
            default:
                ClockText clock = new ClockText();
                clock.setUserId(uid);
                clock.setUserName(name);
                clock.setClockInfo(text);
                clock.setCreateDate(new Date());
                clockTextService.add(clock);
                json.put("text", "ok");
                break;
        }
        return json;
    }

    @RequestMapping("clockInfo")
    public Object ClockInfo(String opt, String uid, String name, String text, String c_len){
        JSONObject json = new JSONObject();
        if(opt.equals("add")){
            UserClockInfo clockInfo = new UserClockInfo();
            clockInfo.setClockInfo(text);
            clockInfo.setUserId(uid);
            clockInfo.setUserName(name);
            clockInfo.setLen(Integer.valueOf(c_len));
            userClockService.add(clockInfo);
            json.put("text", "ok");
        }else{
            List<UserClockInfo> list = userClockService.getUserClock(uid);
            JSONArray jsonArray = new JSONArray();
            for(UserClockInfo info : list){
                JSONObject obj = new JSONObject();
                obj.put("title", info.getClockInfo());
                obj.put("date", info.getEndTime());
                obj.put("len", info.getLen());
                jsonArray.add(obj);
            }
            json.put("text", jsonArray);
        }
        return json;
    }
}
