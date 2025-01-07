package com.longlijisi.extends6constructor;

public class Test2 {
    public static void main(String[] args) {
        //目标：子类构造器调用父类构造器的应用场景。
        Teacher teacher = new Teacher("龙利基斯","java/springboot/vue",'男');
        System.out.println(teacher.getName());
        System.out.println(teacher.getSkill());
        System.out.println(teacher.getSex());
    }
}
