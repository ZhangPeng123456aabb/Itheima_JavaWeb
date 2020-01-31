package com.baizhi.spring.service.impl;

import com.baizhi.spring.dao.UserDao;
import com.baizhi.spring.entity.User;
import com.baizhi.spring.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }
}
