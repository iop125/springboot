package com.miao.springboot.controller;

import com.miao.springboot.common.RedisUtil;
import com.miao.springboot.domain.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redisController")
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("save")
    public String save(UserPO userPO) {


        return redisUtil.set("miaoyu", "test") + "";
    }
}
