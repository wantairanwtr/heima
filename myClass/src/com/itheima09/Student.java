package com.itheima09;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("无参构造方法");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void show() {
        System.out.println(this.name + "," + this.age);
    }
}
