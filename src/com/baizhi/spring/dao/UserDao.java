package com.baizhi.spring.dao;

import com.baizhi.spring.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> selectAll();
}
