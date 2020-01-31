package com.baizhi.spring.advice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import static org.apache.commons.logging.LogFactory.getLog;

public class MyLogAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        LogFactory lf= LogFactory.getFactory();
        Log log = lf.getLog(MyLogAdvice.class);
        log.debug(new Date()+"进入到了"+o+"的"+method.getName()+",携带的参数是:"+ Arrays.toString(objects));
    }
}
