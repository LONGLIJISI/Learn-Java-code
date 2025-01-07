package com.longlijisi.branch;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //目标：认识if语句，搞清楚其写法和应用场景。（独立功能独立写法）
        demo1();
        demo2();
        demo3();
    }

    public static void demo1(){
        int age = 17;
        if(age > 18){
            System.out.println("可以喝酒了");
        }
        System.out.println("您还未成年，请离开该场地");
        //注意：if语句中如果只有一行代码，大括号可以省略不写。
    }


    //需求：假如您的钱包金额是90元，现在要转出80元，请用if分支实现。
    //需求：钱够就提示转账成功，钱不够提示余额不足。
    public static void demo2(){
        int money = 70;
        int transfer = 80;
        if(money >= transfer){
            System.out.println("转账成功");
        }else{
            System.out.println("您的余额不足");
        }
    }

    public static void demo3(){
        //需求：有个绩效系统，每个月由主管给员工打分。
        //会输出你这个月的绩效级别：A、B、C、D、E。
        //级别的区别情况：90-100：A，80-89：B，70-79：C，60-69：D，60以下：E。
        System.out.println("请录入该员工的分数:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 90 && score <= 100){
            System.out.println("A");
        }else if(score >= 80 && score < 90){
            System.out.println("B");
        }else if(score >= 70 && score < 80){
            System.out.println("C");
        }else if(score >= 60 && score < 70){
            System.out.println("D");
        }else{
            System.out.println("该员工分数不合格");
        }
    }
}
