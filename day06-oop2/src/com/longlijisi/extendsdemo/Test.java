package com.longlijisi.extendsdemo;

public class Test {
    public static void main(String[] args) {
        //目标：认识继承的好处
        //1.创建对象，封装老师数据
        //子类可以继承父类的私有成员
        //子类对象其实是由子类和父类多张设计图共同创建出来的对象，所以子类对象时完整的。
        Teacher teacher = new Teacher();
        teacher.setName("龙利基斯");
        teacher.setSkill("java，前端，mysql");
        teacher.setSex('男');
        System.out.println(teacher.getName());
        System.out.println(teacher.getSkill());
        System.out.println(teacher.getSex());

        Consultant consultant = new Consultant();
        consultant.setNumber(123);
        System.out.println(consultant.getNumber());
    }
}
