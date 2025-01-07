package com.longlijisi.method.scanner;
//1.导包：

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
    printUserInfo();
    }
    //需求：我是一个零基础小白，请帮我写一个程序，可以让用户键盘输入用户和年龄，然后打印出来
    public static void printUserInfo(){
        //1.导包
        //2.创建键盘录入对象（得到一个sacnner扫描器对象）
        Scanner sc = new Scanner(System.in);
        //3.调用方法，获取用户输入的数据
        System.out.println("请输入用户名：");
        //让程序在这一行暂停，等到用户输入一个字符串名称，直到按了回车之后，把名字交给变量username再往下走
        String username = sc.next();
        System.out.println("您叫：" + username);

        System.out.println("请输入年龄：");
        //让程序在这一行暂停，等到用户输入一个整数，知道按了回车健之后，把年龄交给变量age再往下走
        int age = sc.nextInt();
        System.out.println("您多少岁：" + age);
        //4.打印输出
    }
}
