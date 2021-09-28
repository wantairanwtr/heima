package com.itheima09;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("林青霞");
        s1.setAge(30);
        s1.show();
        Student s2=new Student("风清扬",60);
        s2.show();
    }
}
