package com.longlijisi.javabean;

public class StudentService {
    //提供方法：打印学生对象的总成绩
    private Student student;
    public StudentService(Student student) {
        this.student = student;
    } 
    public void printTotalScore(){
        System.out.println(student.getName() + "的总成绩是：" + (student.getChinese() + student.getMath()));
    }
    //提供方法：打印学生对象的平均成绩
    public void printAverageScore() {
        System.out.println(student.getName() + "的平均成绩是：" + (student.getChinese()+student.getMath()) / 2);
    }
}
