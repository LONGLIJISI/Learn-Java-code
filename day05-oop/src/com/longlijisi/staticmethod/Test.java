package com.longlijisi.staticmethod;

public class Test {
    public static void main(String[] args) {
        //目标：认识static修饰和不休时方法的区别
        //1.类名.静态方法（推荐）
        Student.printlnHelloWorld();

        //2.对象.静态方法（不推荐）
        Student s1 = new Student();
        s1.printlnHelloWorld();

        //3.对象名.实例方法
//        student.printPass(); //报错
        s1.setScore(59.5);
        s1.printPass();

        //准则规范：1.如果这个方法只是为了做一个功能且不需要直接访问对象的数据，这个方法直接定义成静态方法
        //        2.如果这个方法是对象的行为，需要访问对象的数据，这个方法必须定义成实例方法。
    }
}
