package com.baizhi.spring.test;


import com.baizhi.spring.dao.impl.UserDaoImpl;
import com.baizhi.spring.entity.User;
import com.baizhi.spring.service.UserService;
import com.baizhi.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl u =(UserServiceImpl) context.getBean("userService");
        System.out.println(u.selectAll());
    }
}
