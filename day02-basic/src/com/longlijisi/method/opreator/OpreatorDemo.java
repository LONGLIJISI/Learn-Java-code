package com.longlijisi.method.opreator;

public class OpreatorDemo {
    public static void main(String[] args) {
        //目标：搞清楚基本的算术运算符
        print(10,3);

        System.out.println("------------------");

        print2();
    }
    public static void print(int a,int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }

    //需求：研究+符号做连接符还是做运算符
    public static void print2(){
        int a = 5;
        System.out.println("abc" + a );
        System.out.println(a + 5);
        System.out.println("longlijisi" + a  + 'a');
        System.out.println(a + 'a' + "longlijisi");
    }
}
