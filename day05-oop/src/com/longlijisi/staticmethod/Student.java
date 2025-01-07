package com.longlijisi.staticmethod;

public class Student {
    private double score;
    //静态方法：有static修饰，属于类持有。
    public static void printlnHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    //实例方法：没有static修饰，属于对象持有。
    public void printPass(){
        System.out.println(score >= 60 ? "通过了" : "你挂科了！");
    }
    public void setScore(double score){
        this.score = score;
    }
}
