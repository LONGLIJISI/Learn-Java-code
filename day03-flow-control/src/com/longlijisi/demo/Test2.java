package com.longlijisi.demo;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

    //简单版

//    public static void main(String[] args) {
//        //目标：猜数字游戏
//        guessNumber();
//    }
//
//    public static void guessNumber() {
//        //1.生成随机数：1-100之间
//
//        //方式一：
//        //Math.random() : 返回[0,1）的随机小数
//        //Math.random() * 100 ==> [0,100)的整数 => [0,99] + 1 => [1,100]
//        //int sum = (int)(Math.random() * 100) + 1;
//
//        //方式二：
//        Random r = new Random();
//        int luckNumber = r.nextInt(100) + 1;//[0,99] + 1 => [1,100]
//
//        //2.定义一个死循环让用户一直猜测，直到猜中猜结束循环。
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            //3.让用户输入猜测的数字
//            System.out.println("请输入猜测的数字：");
//            int guessNumber = sc.nextInt();
//
//            //4.判断猜测的数字和随机数是否一致，一致则猜中，结束循环，否则继续猜测。
//            if (guessNumber == luckNumber) {
//                System.out.println("恭喜你，猜对了！");
//                break;
//            } else if (guessNumber > luckNumber){
//                System.out.println("猜大啦！");
//            }else {
//                System.out.println("猜小啦！");
//            }
//        }
//    }


    //完整版


        public static void main(String[] args) {
            // 目标：猜数字游戏
            guessNumber();
        }

        public static void guessNumber() {
            // 1. 生成随机数：1-100之间
            Random r = new Random();
            int luckNumber = r.nextInt(100) + 1; // [1, 100]
            int attempts = 0; // 记录猜测次数

            Scanner sc = new Scanner(System.in);

            // 2. 定义一个死循环让用户一直猜测，直到猜中
            while (true) {
                // 3. 让用户输入猜测的数字
                System.out.println("请输入猜测的数字：");
                if (sc.hasNextInt()) {
                    int guessNumber = sc.nextInt();
                    attempts++; // 增加猜测次数

                    // 4. 判断猜测的数字和随机数是否一致
                    if (guessNumber == luckNumber) {
                        System.out.println("恭喜你，猜对了！你总共猜了 " + attempts + " 次。");
                        break;
                    } else if (guessNumber > luckNumber) {
                        System.out.println("猜大啦！");
                    } else {
                        System.out.println("猜小啦！");
                    }
                } else {
                    System.out.println("请输入一个有效的数字！");
                    sc.next(); // 清除无效输入
                }
            }

            // 询问用户是否要再玩一次
            System.out.println("是否要再玩一次？(y/n)");
            char choice = sc.next().charAt(0);
            if (choice == 'y' || choice == 'Y') {
                guessNumber(); // 重新开始游戏
            } else {
                System.out.println("感谢游戏，拜拜！");
            }

            sc.close(); // 关闭扫描器
        }
    }