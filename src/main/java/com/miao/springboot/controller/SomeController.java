package com.miao.springboot.controller;

import com.miao.springboot.domain.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@PropertySource("classpath:custom.properties")
@RequestMapping("/someController")
public class SomeController {
    @Value("${compoy.name}")
    private String name;

    @Autowired
    private StudentDTO studentDTO;

    @GetMapping("hello.action")
    public String ss(){
        return "--0-";
    }

    @GetMapping("getParam")
    public String getParam(){

        return "name :"+name+"   studentDTO: "+studentDTO.toString();
    }

    @GetMapping("toIndex")
    public String toIndex(){

        return "index";
    }
}
