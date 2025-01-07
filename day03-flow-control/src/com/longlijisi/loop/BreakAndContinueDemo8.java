package com.longlijisi.loop;

public class BreakAndContinueDemo8 {
    public static void main(String[] args) {
        //目标：搞清楚break和continue的作用
//        test1();
        test2();
    }

    public static void test1() {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;// 跳出循环并结束循环，不再执行循环体
            }
            System.out.println(i);
        }
    }

    public static void test2() {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;// 跳出本次循环，继续执行下一次循环
            }
            System.out.println(i);
        }
    }
}
