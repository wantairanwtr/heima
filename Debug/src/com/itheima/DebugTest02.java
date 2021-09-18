package com.itheima;

import java.util.Scanner;

public class DebugTest02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入第一个整数");
        int a=in.nextInt();
        System.out.println("输入第二个数");
        int b=in.nextInt();
        int max=getMax(a,b);
        System.out.println("较大的值是"+max);
    }
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
