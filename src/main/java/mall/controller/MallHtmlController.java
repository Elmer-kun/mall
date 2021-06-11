package mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author elmer
 * @date 2021/6/10 15:54
 */
@Controller
public class MallHtmlController {

    @RequestMapping("/index")
    public String boringIndex(){
        return "Index";
    }
}
