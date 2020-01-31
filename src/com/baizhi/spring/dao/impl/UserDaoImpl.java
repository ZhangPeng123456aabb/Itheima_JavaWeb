package com.baizhi.spring.dao.impl;

import com.baizhi.spring.dao.UserDao;
import com.baizhi.spring.entity.User;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public List<User> selectAll() {
        System.out.println("获取到所有的用户信息");
        return null;
    }
}
