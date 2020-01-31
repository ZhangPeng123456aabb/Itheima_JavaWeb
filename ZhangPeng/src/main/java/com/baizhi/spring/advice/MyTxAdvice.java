package com.baizhi.spring.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 这是一个公共处理类
 * 用来处理事务的
 * @author Carry
 */
public class MyTxAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("公共处理");
    }
}
