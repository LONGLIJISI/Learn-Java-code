package com.longlijisi.javabean;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚实体类是什么？搞清楚其基本作用和应用场景。
        //实体类的基本作用：创建它的对象，存取数据（封装数据）

        //无参数调取
        Student s1 = new Student();
        //存储数据
        s1.setName("波妞");
        s1.setChinese(88);
        s1.setMath(69);
        //取出数据
        System.out.println(s1.getName());
        System.out.println(s1.getChinese());
        System.out.println(s1.getMath());

        //有参数调取
        Student s2 = new Student("龙利基斯",88,77);
        System.out.println(s2.getName());
        System.out.println(s2.getChinese());
        System.out.println(s2.getMath());

        //实体类在开发中的应用场景。
        //创建一个学生的操作对象专门负责对学生对象的数据进行业务处理。
        StudentService service = new StudentService(s1);
        service.printTotalScore();
        service.printAverageScore();
    }
}
