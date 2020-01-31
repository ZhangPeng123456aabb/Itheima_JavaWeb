package com.baizhi.spring;

public class TestInner1 {
    public static void main(String[] args) {
        Outer1 o  = new Outer1();
        Outer1.Inner inner = o.new Inner();
        inner.inner_method();
    }
}
class Outer1{
    int a=20;
    class Inner{
        int a=10;
        public void inner_method(){
            int a=30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer1.this.a);
        }
    }
}