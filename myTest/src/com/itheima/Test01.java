package com.itheima;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入一个数字");
        int week=in.nextInt();
        if(week<1||week>7){
            System.out.println("你输入的数值范围有误");
        }else if(week==1){
            System.out.println("星期一");
        }else if(week==2){
            System.out.println("星期二");
        }else if(week==3){
            System.out.println("星期三");
        }else if(week==4){
            System.out.println("星期四");
        }else if(week==5){
            System.out.println("星期五");
        }else if(week==6){
            System.out.println("星期六");
        }else if(week==7){
            System.out.println("星期日");
        }
    }
}
