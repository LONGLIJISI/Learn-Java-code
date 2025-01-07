package com.longlijisi.capsulation;

public class Student {
    String name;
    //1.如何隐藏：使用private关键字（私有，隐藏）修饰成员变量，就只能在本类中被直接访问。
    private int age;
    private double chinese;
    private double math;

    //2.如何暴露（合理暴露）：使用public修饰(公开)的get和set方法合理暴露。
    //成员变量的取值和赋值
    public void setAge(int age){  // 为年龄赋值
        if (age > 0 && age < 100 ) {
            this.age = age;
        }else {
            System.out.println("你赋值的年龄数据非法！");
        }
    }
    public void setChinese(double chinese){
        if(chinese > 0 && chinese < 100 ){
            this.chinese = chinese;
        }else {
            System.out.println("你赋值的成绩数据非法！");
        }
    }

    public int getAge(){  // 获取年龄
        return age;
    }

    public double getChinese(){
        return chinese;
    }

    public void printAllScore(){
        System.out.println("总成绩：" + (chinese + math));
    }

    public void printAverageScore() {
        System.out.println("平均成绩：" + ((chinese + math) / 2));
    }
}
