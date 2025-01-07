package com.longlijisi.constructor;

public class Test {
    public static void main(String[] args) {
        //目标：认识类的构造器，搞清楚其特点和常见应用场景
        //构造器的特点:创建对象时，对象会立即自动调用构造器
        Student s1 = new Student();
        Student s2 = new Student("龙利基斯");

        System.out.println("================");
        Student t1 = new Student();
        t1.name = "龙利基斯";
        t1.age = 23;
        t1.sex = '男';
        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.sex);

        System.out.println("=========================");


        //对象的一种常见应用场景；创建对象时可以立即为对象赋值。
        Student t2 = new Student("龙利基斯", 23 ,'男');
        System.out.println(t2.name);
        System.out.println(t2.age);
        System.out.println(t2.sex);
    }
}
