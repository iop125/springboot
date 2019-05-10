package com.miao.springboot.controller;

import com.miao.springboot.dao.UserMapper;
import com.miao.springboot.domain.po.UserPO;
import com.miao.springboot.service.ChoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("mybaitsController")
public class MybaitsController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("save")
    public String save(UserPO userPO){
        int i = userMapper.insert(userPO);
        System.out.println("----"+i);

        return  userMapper.getAll().toString();
    }
}
