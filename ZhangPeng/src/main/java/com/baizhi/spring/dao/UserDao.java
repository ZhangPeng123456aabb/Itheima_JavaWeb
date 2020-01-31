package com.baizhi.spring.dao;

import com.baizhi.spring.entity.User1;

import java.util.List;

public interface UserDao {
    /**
     * @return
     *加载所有用户
     */
    public List<User1> getAll();
}
