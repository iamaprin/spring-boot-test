package me.vilya.test.a;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * author: iamaprin
 * time: 2016/7/9 10:58
 */

@Controller
public class CController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/freemarker")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/freemarker2")
    public String freemarker2(Model model) {
        model.addAttribute("time", new Date());
        model.addAttribute("message", this.message);
        return "welcome";
    }

    @RequestMapping("/freemarker3")
    public String fremarker3(Model model) {
        model.addAttribute("title", "freemarker3");
        model.addAttribute("created", new Date());
        model.addAttribute("content", this.message);
        return "posts";
    }
}
