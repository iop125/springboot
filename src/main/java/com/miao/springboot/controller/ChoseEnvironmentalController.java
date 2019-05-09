package com.miao.springboot.controller;

import com.miao.springboot.service.ChoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ChoseEnvironmentalController {

    @Autowired
    private ChoseService choseService;

    @GetMapping("chose")
    public String ss(){
        return choseService.read();
    }
}
