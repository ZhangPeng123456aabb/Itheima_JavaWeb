package com.baizhi.spring;

public class test7 {
    public static void main(String[] args) {
        /*xu(17);*/
        arg(14);
    }
    /*public static int xu(int n) {
        int i = 0;
        for(int a=1;a<=n;a++){
            if(n%a==0){
                i++;
            }
        }
        if(i==2){
            System.out.println(n+"是质数");
            return 0;
        }else{
            System.out.println(n+"不是质数");
            return 1;
        }
    }*/
    public static int arg(int n){
        int a,b;
        if(n>6&&n%2==0){
            for(a=1;a<=n;a++){
                for(b=1;b<=n;b++){
                    if(n==a+b&&a>=b){
                        System.out.println(a+"+"+b+"="+n);
                    }
                }
            }
        }
        return 0;
    }
}
