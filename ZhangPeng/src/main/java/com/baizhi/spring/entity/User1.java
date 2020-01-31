package com.baizhi.spring.entity;

public class User1 {
    private String username;
    private String password;
    private int state;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public User1(String username, String password, int state) {
        this.username = username;
        this.password = password;
        this.state = state;
    }

    public User1() {
    }

    @Override
    public String toString() {
        return "User1{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", state=" + state +
                '}';
    }
}
