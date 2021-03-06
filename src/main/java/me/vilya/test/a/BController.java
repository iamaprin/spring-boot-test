package me.vilya.test.a;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * author: iamaprin
 * time: 2016/7/9 0:10
 */

@Controller
//@RequestMapping("a")
public class BController {

    @RequestMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("title", "This is a post with id = 2");
        model.addAttribute("created", new Date());
        model.addAttribute("content", "This is content");
        return "posts";
    }
}
