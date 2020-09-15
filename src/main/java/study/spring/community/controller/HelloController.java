package study.spring.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wmd
 */
@Controller
public class HelloController {
    //网址添加的部分
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name",name);
        // 在 resources/templates 下寻找同名的 html 文件
        return "hello";
    }
}