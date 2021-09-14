package com.itheima05;

public class MethodDemo {
    public static void main(String[] args) {
        int r1=sum(10,20);
        System.out.println(r1);
        double r2=sum(10.0,20.0);
        System.out.println(r2);
        int r3=sum(10,20,30);
        System.out.println(r3);
        String s1=sum("你好","迪迦");
        System.out.println(s1);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static String sum(String a,String b){
        return a+b;
    }
}
