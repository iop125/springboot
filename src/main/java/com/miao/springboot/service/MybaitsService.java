package com.miao.springboot.service;

import com.miao.springboot.dao.UserMapper;
import com.miao.springboot.domain.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface MybaitsService {

    List<UserPO> getAll();

    UserPO getOne(Long id);

    int insert(UserPO userPO);

    int delete(Long id);
}
