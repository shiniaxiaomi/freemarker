package freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 陆英杰
 * 2018/9/13 21:35
 */

/**
 * DESC: indexController,当请求/时,返回templates模板中的index.html模板
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String welcome(){
        return "index";
    }

}
