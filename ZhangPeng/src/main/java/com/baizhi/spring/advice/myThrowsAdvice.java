package com.baizhi.spring.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class myThrowsAdvice implements ThrowsAdvice {
    /**
     * Tag interface
     * 标记性接口
     */
    public void afterThrowing(Method method,Object[] args,Object target,Exception ex){
        System.out.println("*******"+ex.getMessage());
    }
}
