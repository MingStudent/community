package lucky.mxcai.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//作为spring的一个Bean去管理
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
