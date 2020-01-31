package com.baizhi.spring.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection implements FactoryBean<Connection> {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Connection getObject() throws Exception {

        //System.out.println("进入到这个方法");
        //用log4j做日志记录
        Log log = LogFactory.getLog(MyConnection.class);
        log.info("进入到了这个方法");

        Class.forName(driverClassName);
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}