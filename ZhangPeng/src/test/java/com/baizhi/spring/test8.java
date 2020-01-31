package com.baizhi.spring;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        System.out.print("请输入一个大于6的偶数:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n<=6 || n%2==1){
            System.out.println("输入错误!");
            System.exit(0);
        }
        System.out.println(n+"分解为两个质数之和:");
        for(int i=3;i<n/2;i+=2){
            if(pd(i)&&pd(n-i)){
                System.out.println(n+"="+i+"+"+(n-i));
            }
        }
    }
    public static boolean pd(int n){
        for(int i=3;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
