package com.longlijisi.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 目标：掌握方法的定义和调用
        int sum = getSum(10, 20);
        System.out.println("和是" + sum);
    }
    // 定义一个方法，求任意两个整数的和并返回
    public static int getSum(int a, int b) {
        return a + b;
    }

    public int add(int a, int b){
        return a + b;
    }

    // 需求：打印3行HelloWorld，不需要参数，也不需要返回值
    //注意：如果方法没有返回结果，返回值类型必须声明成void。
    //无参数，无返回值类型
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }

    //需求3：获取一个指定位数的验证码返回。
    //掌握方法的定义格式。
    //需要接受数据吗？需要，需要接收位数。
    //需求返回数据吗？
}
