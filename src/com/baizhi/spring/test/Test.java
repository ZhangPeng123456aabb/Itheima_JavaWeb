package com.baizhi.spring.test;

import org.springframework.context.ApplicationContext;
import com.baizhi.spring.test.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //创建spring工厂
        //加载spring配置文件，创建spring工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从Spring容器中得到一个对象
        BookService service = (BookService)context.getBean("bookServiceee");
        service.delete(12);

    }
}
