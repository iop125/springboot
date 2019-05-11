package com.miao.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleafController")
public class ThymeleafController {

    @RequestMapping("index")
    public String index(Model model) {
        model.addAttribute("text", "hello Thym1eleaf");
        return "index";
    }
}
