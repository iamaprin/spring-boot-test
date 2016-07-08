package me.vilya.a;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author: iamaprin
 * time: 2016/7/9 0:10
 */

@Controller
@RequestMapping("a")
public class BController {

    @RequestMapping("/posts/{id}")
    public @ResponseBody String posts(@PathVariable("id") long id, Model model) {
        model.addAttribute("title", "This is a post with id = " + id);
        model.addAttribute("created", "2015-08-11");
        model.addAttribute("content", "This is content");
        return "posts";
    }
}
