package com.itheima08;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.show();
        Student s2=new Student("林青霞",30);
        s2.show();
        Student s3=new Student("风清扬");
        s3.show();
        Student s4=new Student(60);
        s4.show();
    }
}
