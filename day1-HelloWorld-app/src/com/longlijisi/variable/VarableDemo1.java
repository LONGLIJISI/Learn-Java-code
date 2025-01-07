package com.longlijisi.variable;

public class VarableDemo1 {
    public static void main(String[] args) {
        //目标：认识变量。
        printVariable();
    }
    //定义一个方法，来学习变量的使用。
    public static void printVariable(){
        //局部变量
        int age = 18;
        System.out.println(age);

        // 定义一个小数变量，存储一个学生的java成绩
        double score = 89.5;
        System.out.println(score);

        System.out.println("------------------");
        //为什么要用变量记住数据呢？可以提高处理数据的灵活性和维护性。
        int number = 20;
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);

        System.out.println("===================");

        //研究变量的特点：变量里的数据是可以被替换的。
        int age2 = 18;
        age2 = 19;//赋值
        System.out.println(age2);

        age2 = age2 + 1;//赋值（从右往左看）
        System.out.println(age2);

        System.out.println("=================");
        // 需求：微信钱包目前有9.9，发出去了5元，又说到了7元，请实时更新钱包金额。
        double money = 9.9;
        System.out.println(money);

        //发出去了5元。
        money = money - 5;
        System.out.println(money);

        //说到了7元。
        money = money + 7;
        System.out.println(money);
    }
}
