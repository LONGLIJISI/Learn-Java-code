package com.longlijisi;

public class ArrayTest4 {
    public static void main(String[] args) {
        //目标：完成斗地主游戏 的做牌和洗牌
        startGame();
    }

    public static void startGame(){
        //1.做牌：创建一个动态初始化的数组存储54张牌
        String[] poker = new String[54];
        //2.准备四种花色，还有点数，再开始做牌存入数组中。
        String[] colors = new String[] {"♠","♥","♣","♦"};
        //                                i
        String[] numbers = new String[] {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        //                                 j
        int index = 0;//定义一个变量记录牌存储的索引位置
        //3.分别遍历
        for (int i = 0; i < numbers.length ; i++) {
            // 当前点数 number[i]
            for (int j = 0; j < colors.length; j++) {
                poker[index++] = colors[j] + numbers[i];
            }
        }
        //4.将大小王存入数组中。
        poker[index++] = "小王";
        poker[index] = "大王";

        System.out.println("新牌：");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < poker.length; i++) {
            int index1 = (int)(Math.random() * poker.length);
            int index2 = (int)(Math.random() * poker.length);

            String temp = poker[index2];
            poker[index2] = poker[index1];
            poker[index1] = temp;
        }
        System.out.println("洗牌后：");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + " ");
        }
        System.out.println();
    }
}
