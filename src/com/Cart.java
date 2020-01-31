package com;

import java.io.Serializable;

public class Cart implements Serializable {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cart(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Cart() {
    }

    @Override
    public String toString() {
        return "Cart{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
