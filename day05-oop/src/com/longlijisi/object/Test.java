package com.longlijisi.object;

public class Test {
    public static void main(String[] args) {
        //目标：学会创建对象。
        //创建对象的格式：类名 对象名 = new 类名（）
        Star s1 = new Star();
        s1.name = "龙利基斯";
        s1.age = 23;
        s1.height = 172.5;
        s1.weight = 66.5;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.height);
        System.out.println(s1.weight);
    }
}
