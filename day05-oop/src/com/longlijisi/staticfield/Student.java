package com.longlijisi.staticfield;

public class Student {

    //静态变量：属于类，只加载一份，可以被类和类的全部对象共享访问
    static String name;
    //实例变量：没有static修饰，属于对象，每一个对象都可以访问。
    int age;
}
