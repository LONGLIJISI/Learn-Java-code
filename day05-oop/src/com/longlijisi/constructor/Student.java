package com.longlijisi.constructor;

public class Student {
    String name;
    int age;
    char sex;
    // 1.无参数构造器：
    // 构造器：是一种特殊的方法，不能写返回值类型，名称必须是类名，就是构造器。
    public Student(){
        System.out.println("无参构造器执行了");
    }

    //2.有参数构造器
    public Student(String n){
        System.out.println("有参数构造器执行了");
    }

    public Student(String n , int a, char s){
        name = n;
        age = a;
        sex = s;
    }
}
