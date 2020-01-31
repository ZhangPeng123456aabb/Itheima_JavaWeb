package com.baizhi.spring;

import com.baizhi.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) context.getBean("userService");
       /* service.delete(1);*/
        service.reg("a");
    }
}
