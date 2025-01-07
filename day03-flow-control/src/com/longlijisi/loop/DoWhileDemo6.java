package com.longlijisi.loop;

public class DoWhileDemo6 {
    public static void main(String[] args) {
        //目标：搞清楚do-while循环的写法，并理解其特点。
        test1();
    }
    public static void test1()
    {
        int i = 1;
        do{
            System.out.println("hello world");
            i++;
        }while(i<=3);
    }
}
