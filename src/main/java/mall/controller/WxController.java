package mall.controller;


import com.alibaba.fastjson.JSONObject;
import mall.base.BaseUtil;
import mall.entity.TextLinkMood;
import mall.service.MoodModelService;
import mall.service.MoodTextService;
import mall.service.TextLinkMoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("/wx")
public class WxController {

    @Autowired
    MoodModelService modelService;

    @Autowired
    MoodTextService moodTextService;

    @Autowired
    TextLinkMoodService textLinkMoodService;

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
        return  moodTextService.findText("喜");
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
        json.put("text", "sucess");
        return  json;
    }
}
