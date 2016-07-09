package me.vilya.test.a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author: iamaprin
 * time: 2016/7/8 23:29
 */

@Controller
@RequestMapping(value = "a")
public class AController {

    @RequestMapping("/hello")
    public @ResponseBody String hello() {
        return "Hello spring";
    }

    @RequestMapping("/say/{word}")
    public @ResponseBody String say(@PathVariable("word") String word) {
        return "Hello " + word;
    }
}
