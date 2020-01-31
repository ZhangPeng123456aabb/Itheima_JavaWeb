package com.baizhi.spring;

public class test9 {
    public static void main(String[] args) {
        Outer inner = new Outer();
        inner.m1();
    }
}
class Outer{
    int a=10;
    class Inner{
        public void m1(){
            int a=20;
            System.out.println(a);
        }
    }
    public void m1(){
        System.out.println(30);
    }
}
