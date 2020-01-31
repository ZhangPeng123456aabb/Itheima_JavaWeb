package com.baizhi.spring.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
    private List list;
    private Set set;
    private Map map;
    private Properties properties;
    public void setList(List list) {
        this.list = list;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
