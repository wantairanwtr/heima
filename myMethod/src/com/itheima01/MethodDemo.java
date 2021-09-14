package com.itheima01;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(10));
    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }
}
