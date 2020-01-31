package com.baizhi.spring.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        methodInvocation.getArguments();//args
        methodInvocation.getMethod();//method
        methodInvocation.getThis();//target
        System.out.println("前置");
        Object obj = methodInvocation.proceed();
        System.out.println("后置");
        return obj;
    }
}
