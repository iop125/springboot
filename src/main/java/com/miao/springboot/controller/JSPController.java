package com.miao.springboot.controller;

import com.miao.springboot.domain.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/jspController")

public class JSPController {


    @GetMapping("toIndex")
    public String toIndex(){

        return "indexJsp";
    }
}
