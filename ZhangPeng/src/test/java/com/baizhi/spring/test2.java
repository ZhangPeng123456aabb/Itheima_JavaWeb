package com.baizhi.spring;

import org.junit.Test;

import java.util.Scanner;

public class test2 {
    @Test
    public void t1(){
        int i = 1;
        while(i<=10){
            System.out.println("跑步"+i);
            i++;
    }
  }
  @Test
  public void t2(){
        for(int i=1;i<=10;i++){
            System.out.println("跑步"+i);
        }
  }
  @Test
    public void t3(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=n;i++){
            sum += i;
        }
      System.out.println(sum);
  }
  @Test
    public void t4(){
        for(int i  = 0;i<10;i++){
            if(i==6){
                break;
            }
            System.out.println("i="+i);
        }
  }
  @Test
    public  void printSplit(){
        for(int i =0;i<20;i++){
            System.out.println("*");
        }
      System.out.println();
  }

}
