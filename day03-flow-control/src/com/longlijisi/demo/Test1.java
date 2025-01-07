package com.longlijisi.demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //目标：简易版计算器开发
        //1.键盘录入两个整数，以及运算符。
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        String operator = "";

        System.out.println("请输入第一个整数：");
        num1 = sc.nextDouble();

        System.out.println("请输入第二个整数");
        num2 = sc.nextDouble();

        System.out.println("请输入运算符( + , - , * , / )：");
        operator = sc.next();

        //2.把这个数据交给一个独立的计算方法，帮我计算结果并返回给我
        double result = calc(num1, num2, operator);

        //3.把结果打印到控制台
        if(Double.isNaN(result)) {
            System.out.println("计算出现错误。");
        }else {
            System.out.println("计算结果是：" + result);
        }
    }

    public static double calc(double num1, double num2, String operator) {
        double result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(num2 != 0){
                    result = num1 / num2;
                }else {
                    System.out.println("错误：除数不能为零。");
                    return Double.NaN;
                }
                break;
            default:
                System.out.println("运算符有误，请重新输入");
                return Double.NaN;
        }
        return result;
    }
}
