package com.miao.springboot.dao;

import com.miao.springboot.domain.po.UserPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {

    List<UserPO> getAll();

    UserPO getOne(Long id);

    int insert(UserPO userPO);

    int delete(Long id);
}
