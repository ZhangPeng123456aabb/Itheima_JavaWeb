package com.baizhi.spring;

public class TestInner2 {
    public static void main(String[] args) {
        System.out.println(Outer2.a);
        Outer2.Inner2 inner = new Outer2.Inner2();
        inner.m1();
    }
}
class Outer2{
    int d=20;
    static int a=20;//静态属性可以通过类名来调用
    static class Inner2{
        int b=20;
        static int c=30;
        public void m1(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}