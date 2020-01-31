package com.baizhi.spring.service.impl;

import com.baizhi.spring.dao.UserDao;
import com.baizhi.spring.entity.User1;
import com.baizhi.spring.service.UserService;
import com.baizhi.spring.util.Log;

public class UserServiceImpl implements UserService {
   private UserDao dao;
    @Override
    @Log
    public void delete(int id) {
        System.out.println("删除操作"+id);
    }

    @Override
    public boolean reg(String username) {
        System.out.println("核心功能");
       /* int i =  0 ;
        System.out.println(1/0);*/
        return false;
    }

    @Override
    public boolean add(User1 user) {

        return false;
    }
}