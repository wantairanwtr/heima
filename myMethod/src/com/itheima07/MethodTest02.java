package com.itheima07;

public class MethodTest02 {
    public static void main(String[] args) {
        int[] arr={12,45,98,73,60};
        int max=getMax(arr);
        System.out.println(max);
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
