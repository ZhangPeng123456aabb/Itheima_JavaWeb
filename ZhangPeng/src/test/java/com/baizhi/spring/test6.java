package com.baizhi.spring;

import org.junit.Test;

public class test6 {
    public static void main(String[] args) {

        int[][] a= new int[][]{{10,8,7},{20,45,60},{14,25,70},{120,20,7}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    @Test
    public void m1(){
        int arr[]={4,5,8,10};
        int a[]=new int[8];
        for(int i=0;i<arr.length;i++){
            a[i]=arr[i];
            a=arr;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
