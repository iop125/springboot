package com.miao.springboot.controller;

import com.miao.springboot.domain.po.UserPO;
import com.miao.springboot.service.MybaitsService;
import com.miao.springboot.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redisController")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("save")
    public String save(UserPO userPO){


        return  redisService.add("miaoyu","test")+"";
    }
}
