package com.longlijisi.object;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "波妞";
        s1.chinese = 100;
        s1.math = 100;
        System.out.print(s1.name + "\n" + "语文成绩：" + s1.chinese);
        System.out.println("\n" + "数学成绩：" + s1.math);

        s1.printAllScore();
        s1.printAverageScore();

        System.out.println("=========================");

        Student s2 = new Student();
        s2.name = "宗介";
        s2.chinese = 69;
        s2.math = 100;
        System.out.print(s2.name + "\n" + "语文成绩：" + s2.chinese);
        System.out.println("\n" + "数学成绩：" + s2.math);

        s2.printAllScore();
        s2.printAverageScore();
    }
}
