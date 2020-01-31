package com.baizhi.spring.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MyAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object result, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("afterReturning"+result+"***"+method.getName()+"**"+ Arrays.toString(args)+"**"+target);
    }
}
