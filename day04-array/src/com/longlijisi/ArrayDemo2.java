package com.longlijisi;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //目标：掌握数组的另一种定义方式：动态初始化数组。
        inputSocre();
    }

    //设计一个方法录入学生成绩
    public static void inputSocre() {
        //1.你需要一个数组来存储8名学生的成绩。
        //动态初始化数组，只确定数组的类型和存储数据的容量。不事先存入具体数据。
        //数据类型[] 数组名 = new 数据类型[长度]
        double[] scores = new double[8];
        // scores = [0.0 , 0.0 , 0.0, 0.0 , 0.0 , 0.0 , 0.0 , 0.0 ]
        //            0     1    2     3     4     5     6     7

        //2，录入8名学生，录入的数据，存储到数组中。
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            scores[i] = sc.nextDouble();
        }

        //3.遍历数组，统计总分，统计最高分，统计最低分。
        double allScore = 0;
        double maxScore = scores[0];
        double minScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            double score = scores[i];
            allScore += score;

            if(maxScore < score){
                maxScore = score;
            }

            if(minScore > score){
                minScore = score;
            }
        }
        System.out.println("平均分：" + allScore / scores.length);
        System.out.println("最高分：" + maxScore);
        System.out.println("最低分：" + minScore);
        sc.close();
    }
}
