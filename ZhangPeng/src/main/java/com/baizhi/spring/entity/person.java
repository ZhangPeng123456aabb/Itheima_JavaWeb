package com.baizhi.spring.entity;

public class person {
    private Integer id;
    private String name;
    private String password;

    public person(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public person(String password) {
        this.password = password;
    }

    public person(Integer id) {
        this.id = id;
    }

    public person() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
