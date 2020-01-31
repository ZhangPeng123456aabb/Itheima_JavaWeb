package com.baizhi.spring.test.service.impl;
import com.baizhi.spring.test.service.BookService;


public class BookServiceImpl implements BookService {
    @Override
    public boolean delete(int id) {

        System.out.println("删除一本编号是"+id+"的图书");
        return false;
    }
}
