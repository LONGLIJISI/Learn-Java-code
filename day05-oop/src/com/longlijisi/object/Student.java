package com.longlijisi.object;
//学生类
//封装:把数据和对数据的处理放到同一个类中写
public class Student {
    String name;
    double chinese;
    double math;

    public void printAllScore(){
        System.out.println("总成绩：" + (chinese + math));
    }

    public void printAverageScore() {
        System.out.println("平均成绩：" + ((chinese + math) / 2));
    }
}

