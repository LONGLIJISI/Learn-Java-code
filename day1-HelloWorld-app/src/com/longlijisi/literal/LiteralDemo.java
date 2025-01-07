package com.longlijisi.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        printLiteral();
    }
    public static void printLiteral(){
        // 请帮我直接输出常见的字面量

        //1.整形字面量，直接写
        System.out.println("hello world");
        //2.浮点型字面量，直接写（小数）
        System.out.println(123);
        //3.布尔型字面量，只有true和false
        System.out.println(true);
        System.out.println(false);
        //4.字符型字面量，直接写，单引号，只有且仅有一个字符
        System.out.println('a');
        System.out.println('中');
        System.out.println(' ');
        //（''）会报错
        // 掌握一些特殊的字符:\n(换行功能）\t(Tab缩进功能)
        System.out.println("\"");
        System.out.println("\'");
        System.out.println("\\");
    }
}
