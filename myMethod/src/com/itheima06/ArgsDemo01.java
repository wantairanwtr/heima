package com.itheima06;

public class ArgsDemo01 {
    public static void main(String[] args) {
        int number=100;
        System.out.println(number);
        change(number);
        System.out.println(number);
    }
    public static void change(int number){
        number=200;
    }
}
