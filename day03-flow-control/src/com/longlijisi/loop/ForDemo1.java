package com.longlijisi.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        //目标：掌握for循环的书写，搞清楚其执行流程
        test1();
    }

    public static void test1(){
        //需求：使用for循环，打印3行HelloWorld
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("HelloWorld");
        }
    }
}
