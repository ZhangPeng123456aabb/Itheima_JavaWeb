package com.baizhi.spring.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
    private int id;
    private String username;
    private String password;
    private String[] tels;
    private List<String> qqs;
    private Set<String> emails;
    private Map<String,String> map;

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getEmails() {
        return emails;
    }

    public void setEmails(Set<String> emails) {
        this.emails = emails;
    }

    public List<String> getQqs() {
        return qqs;
    }

    public void setQqs(List<String> qqs) {
        this.qqs = qqs;
    }

    public String[] getTels() {
        return tels;
    }

    public void setTels(String[] tels) {
        this.tels = tels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "map=" + map +
                '}';
    }
}
