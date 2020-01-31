package com.baizhi.spring.service;

import com.baizhi.spring.entity.User1;

public interface UserService {

    public void delete(int id);
    public boolean reg(String username);
    public boolean add(User1 user);
}
