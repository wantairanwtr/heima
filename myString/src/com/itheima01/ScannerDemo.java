package com.itheima01;
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入字符串数据");
        String line =in.nextLine();
        System.out.println("你输入的数据是："+line);
    }
}
