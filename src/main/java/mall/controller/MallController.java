package mall.controller;

import com.alibaba.fastjson.JSONObject;
import mall.base.ResponseUtil;
import mall.entity.mall.MallGoods;
import mall.mapper.mall.MallGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;

/**
 * @author elmer
 * @date 2021/6/9 14:11
 */
@RestController
public class MallController {

    @Autowired
    MallGoodsMapper goodsMapper;

    @RequestMapping("login")
    public Object doLogin(@RequestBody String data){
        JSONObject json = JSONObject.parseObject(data);
        System.out.println(json.get("userName"));
        System.out.println(json.get("passWord"));
        return ResponseUtil.ok();
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

}
