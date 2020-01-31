package com.baizhi.spring;

public class test5 {
    public static void main(String[] args) {
        int[]a=new int[]{11,2,50,4,55,8,99};
        //快速排序[开发应用重点]
      /*  java.util.Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/
      //冒泡排序
      /*  for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length-1;j++){
                int temp=0;
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i1=0;i1<a.length;i1++){
            System.out.println(a[i1]);
        }*/
      //选择排序
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length-1;j++){
                int temp=0;
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i2=0;i2<a.length;i2++){
            System.out.println(a[i2]);
        }
    }
}
