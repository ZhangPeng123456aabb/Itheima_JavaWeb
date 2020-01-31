package com.baizhi.spring.jdkproxy;

import com.baizhi.spring.service.UserService;
import com.baizhi.spring.service.impl.UserServiceImpl;
import org.apache.log4j.helpers.Loader;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//jdk动态代理
public class Test {
    public static void main(String[] args) {
        //目标
       final UserService userService = new UserServiceImpl();
        //增强处理
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("前置增强");
                Object obj = method.invoke(userService, args);
                System.out.println("后置增强");
                return obj;
            }
        };
        //有jdk生成一个UserService这个对象的代理对象
        //面向接口编程，spring就会调用动态代理
        /**
         * spring有两种代理机制
         * 1.jdk动态代理
         * 2.CGLIB动态代理
         * SpringAop的实现原理
         */
        UserService service = (UserService) (Proxy.newProxyInstance(Test.class.getClassLoader(),userService.getClass().getInterfaces(),h));
        service.reg("a");
    }
}
