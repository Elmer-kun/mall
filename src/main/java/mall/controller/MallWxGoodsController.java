package mall.controller;

import com.alibaba.fastjson.JSONObject;
import mall.base.*;
import mall.entity.mall.MallGoods;
import mall.mapper.mall.MallGoodsMapper;
import mall.mapper.mall.MallUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author elmer
 * @date 2021/6/10 16:07
 */
@RestController
@RequestMapping("/wx")
public class MallWxGoodsController {

    @Resource
    MallUserMapper userMapper;

    @Resource
    MallGoodsMapper goodsMapper;

    @RequestMapping("/getGoodsList")
    public Object getGoodsList() {
        JSONObject data = new JSONObject();
        List<MallGoods> list = goodsMapper.getAll();
        data.put("goodsList", list);
        int totalPages = (int) Math.ceil((double) list.size() / 10);
        data.put("count", list.size());
        data.put("filterCategoryList", new ArrayList<>(0));
        data.put("totalPages", totalPages);
        return ResponseUtil.ok(data);
    }

    @GetMapping("/getGoodsDetail")
    public Object getGoodsDetail(Integer id) {
        JSONObject data = new JSONObject();
        MallGoods goods = goodsMapper.selectByPrimaryKey(id);
        try {
            data.put("info", goods);
            data.put("userHasCollect", 0);
            data.put("issue", new ArrayList<>());
            data.put("comment", new ArrayList<>());
            data.put("specificationList", new ArrayList<>());
            data.put("productList", new ArrayList<>());
            data.put("attribute", new ArrayList<>());
            data.put("brand", new ArrayList<>());
            data.put("groupon", new ArrayList<>());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseUtil.ok(data);
    }

    @RequestMapping("/related")
    public Object related(Integer id) {
        return ResponseUtil.ok(2);
    }

}
