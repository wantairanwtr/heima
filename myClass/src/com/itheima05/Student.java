package com.itheima05;

public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 1000) {
            System.out.println("年龄范围超限");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void show() {
        System.out.println(this.name + "," + this.age);
    }
}
