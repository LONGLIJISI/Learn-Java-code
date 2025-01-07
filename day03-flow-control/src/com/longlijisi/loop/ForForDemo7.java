package com.longlijisi.loop;

public class ForForDemo7 {
    public static void main(String[] args) {
        test();
        print99();
    }
    public static void test(){
        //需求：打印4行5列星星
        //1.定义一个循环控制打印几行
        for (int i = 1; i <= 4; i++) {
            //2.定义一个循环控制每行打印多少个星星
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");//print: 不换行打印
            }
            System.out.println();//println: 换行打印
        }
    }

    //需求：制作一个九九乘法表
    public static void print99(){
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + "×" + i + "=" +(i * j) + "\t");
            }
            System.out.println();
        }
    }
}
