package com.itheima;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        Scanner in=new Scanner(System.in);
        System.out.println("输入你想查找的数字");
        int s=in.nextInt();
        int index=getIndex(s,arr);
        System.out.println("index:"+index);
    }
    public static int getIndex(int s,int[]arr){
        int n=-1;
        for(int i=0;i<arr.length;i++){
            if(s==arr[i]){
                n=i;
                break;
            }
        }
        return n;
    }
}
