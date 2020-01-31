package com.baizhi.spring;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int i = sc.nextInt();
        double d= sc.nextDouble();*/
        /*String s = sc.next();*/
        int n = sc.nextInt();
       if(n<6){
           System.out.println("儿童");
       }else if(n <= 13){
           System.out.println("少儿");
       }else if(n<=17){
            System.out.println("青少年");
        }else if(n <= 35){
           System.out.println("青年");
       }else if(n <= 50){
           System.out.println("中年");
       }else{
           System.out.println("中老年");
       }

    }
}
