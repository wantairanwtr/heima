package com.itheima02;

public class StudyDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.name+","+s1.age);
        s1.name="林青霞";
        s1.age=30;
        System.out.println(s1.name+","+s1.age);
        s1.study();
        s1.doHomeWork();
    }
}
