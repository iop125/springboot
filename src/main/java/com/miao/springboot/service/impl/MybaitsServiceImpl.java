package com.miao.springboot.service.impl;

import com.miao.springboot.dao.UserMapper;
import com.miao.springboot.domain.po.UserPO;
import com.miao.springboot.service.MybaitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service
public class MybaitsServiceImpl implements MybaitsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserPO> getAll() {
        return userMapper.getAll();
    }

    @Override
    @Transactional  //添加事物注解
    public UserPO getOne(Long id) {
        return userMapper.getOne(id);
    }

    @Override
    public int insert(UserPO userPO) {
        return userMapper.insert(userPO);
    }

    @Override
    public int delete(Long id) {
        return userMapper.delete(id);
    }
}
