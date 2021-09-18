package com.itheima;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        int[] arr=new int[6];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("输入第"+(i+1)+"个数");
            arr[i]=in.nextInt();
        }
        System.out.println("这个数组是:");
        printArray(arr);
        System.out.println("平均分是"+mean(arr));
    }
    public static double mean(int[] arr){
        int max=arr[0],min=arr[0];
        double sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max||arr[i]==min){
                arr[i]=0;
            }
            sum+=arr[i];
        }
        return sum/(arr.length-2);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }
}
