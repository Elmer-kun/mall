package mall.controller;

import com.alibaba.fastjson.JSONObject;
import mall.base.ResponseUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author elmer
 * @date 2021/6/9 14:11
 */
@RestController
public class MallController {

    @RequestMapping("login")
    public Object doLogin(@RequestBody String data){
        JSONObject json = JSONObject.parseObject(data);
        System.out.println(json.get("userName"));
        System.out.println(json.get("passWord"));
        return ResponseUtil.ok();
    }

}
