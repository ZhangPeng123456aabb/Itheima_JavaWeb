package com.baizhi.spring;

public class test3 {
    public static void printSplit(){
        for(int i =0;i<1;i++){
            System.out.println("*****");
        }
    }
    public static void printSplit(char c,int count){
        for(int i =0;i<count;i++){
            System.out.print(c);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("此马非凡马");
        printSplit('-',20);
        System.out.println("房星本是星");
        printSplit('=',15);
        System.out.println("向前敲瘦骨");
        printSplit('$',10);
        System.out.println("犹自带同生");
        printSplit('#',5);
    }
}
