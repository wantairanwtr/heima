package com.itheima01;

public class MethodTest {
    public static void main(String[] args) {
        System.out.println(getMax(11,99));
    }
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
