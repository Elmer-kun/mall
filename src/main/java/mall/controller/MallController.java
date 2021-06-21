package mall.controller;

import com.alibaba.fastjson.JSONObject;
import mall.base.PasswordUtil;
import mall.base.ResponseUtil;
import mall.entity.mall.*;
import mall.mapper.mall.MallGoodsMapper;
import mall.mapper.mall.MallOrderGoodsMapper;
import mall.mapper.mall.MallOrderMapper;
import mall.mapper.mall.MallUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * @author elmer
 * @date 2021/6/9 14:11
 */
@RestController
public class MallController {

    @Autowired
    MallGoodsMapper goodsMapper;

    @Autowired
    MallUserMapper userMapper;

    @Autowired
    MallOrderMapper orderMapper;

    @Autowired
    MallOrderGoodsMapper orderGoodsMapper;

    @RequestMapping("login")
    public Object doLogin(@RequestBody String data){
        JSONObject json = JSONObject.parseObject(data);
        String name = json.getString("userName");
        String pwd = json.getString("passWord");
        if(null != name && null != pwd){
            MallUser user = userMapper.selectByUserName(name);
            if(user == null){
                return ResponseUtil.fail(-1,"用户名不存在!");
            }
            String plaintext = PasswordUtil.decrypt(user.getPassword(), user.getUsername());
            if(plaintext.equals(pwd)){
                return ResponseUtil.ok();
            }
        }
        return ResponseUtil.fail(-1,  "密码错误!");
    }

    @RequestMapping("getGoodsList")
    public Object getGoodsList(){
        return ResponseUtil.ok(goodsMapper.getAll());
    }

    @RequestMapping("addGoods")
    public Object addGoods(@RequestBody MallGoods goods){
        try {
            goods.setApproveStatus((byte)1);
            goods.setBrokerageType((byte)0);
            goodsMapper.insert(goods);
        }catch (Exception e){
            return ResponseUtil.fail(-1, e.getMessage());
        }
        return ResponseUtil.ok();
    }

    @RequestMapping("editGoods")
    public Object editGoods(@RequestBody MallGoods goods){
        try {
            goodsMapper.updateByPrimaryKey(goods);
        }catch (Exception e){
            return ResponseUtil.fail(-1, e.getMessage());
        }
        return ResponseUtil.ok();
    }

    @RequestMapping("delGoods")
    public Object delGoods(@RequestBody JSONObject json){
        try {
            goodsMapper.deleteByPrimaryKey((int)json.get("id"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseUtil.fail(-1, e.getMessage());
        }
        return ResponseUtil.ok();
    }

    @RequestMapping("goodsPic")
    public Object saveGoodsPic(@RequestBody MultipartFile file){
        try{
            String fileName = (new Date().getTime()) +file.getOriginalFilename();
//            String path  = System.getProperty("user.dir") + "\\" + fileName;
            String path  = System.getProperty("user.dir")+"/mallImg/"+(new Date().getTime()) +file.getOriginalFilename();
            File saveFile = new File(path);
            file.transferTo(saveFile);
            return ResponseUtil.ok(fileName);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseUtil.fail();
    }

    @RequestMapping("getOrdersList")
    public Object getOrdersList(){
        return ResponseUtil.ok(orderMapper.loadAll());
    }

    @RequestMapping("sendOrder")
    public Object sendOrder(@RequestBody JSONObject json){

        try {
            MallOrder order = orderMapper.selectByPrimaryKey(json.getInteger("orderId"));
            if(null != order){
                order.setOrderStatus((short) 301);
                order.setShipChannel(json.getString("shipChannel"));
                order.setShipSn(json.getString("shipSn"));
                order.setShipTime(new Date());
                orderMapper.updateByPrimaryKey(order);
                return ResponseUtil.ok();
            }
        }catch (Exception e){
            return ResponseUtil.fail(-1, e.getMessage());
        }
        return ResponseUtil.fail();
    }

    @RequestMapping("orderRefund")
    public Object orderRefund(@RequestBody JSONObject json){
        try {
            MallOrder order = orderMapper.selectByPrimaryKey(json.getInteger("orderId"));
            if(null != order){
                System.out.println(json.getString("refundMoney"));
                return ResponseUtil.ok();
            }
        }catch (Exception e){
            return ResponseUtil.fail(-1, e.getMessage());
        }
        return ResponseUtil.fail();
    }

    @RequestMapping("orderDetail")
    public Object orderDetail(@RequestBody JSONObject json){
        try {
            JSONObject obj = new JSONObject();
            MallOrder order = orderMapper.selectByPrimaryKey(json.getInteger("id"));
            if(null != order){
                MallOrderGoodsExample orderGoodsExample = new MallOrderGoodsExample();
                orderGoodsExample.createCriteria().andOrderIdEqualTo(order.getId());
                List<MallOrderGoods> orderGoods = orderGoodsMapper.selectByExample(orderGoodsExample);
                MallUser user = userMapper.selectByPrimaryKey(order.getUserId());
                obj.put("order", order);
                obj.put("user", user);
                obj.put("orderGoods", orderGoods);
                return ResponseUtil.ok(obj);
            }
        }catch (Exception e){
            return ResponseUtil.fail(-1, e.getMessage());
        }
        return ResponseUtil.fail();
    }

}
