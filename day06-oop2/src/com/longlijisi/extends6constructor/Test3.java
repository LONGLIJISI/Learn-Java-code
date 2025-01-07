package com.longlijisi.extends6constructor;

public class Test3 {
    public static void main(String[] args) {
        //目标：理解this（...）调用兄弟构造器
        //创建对象，存储一个学生的数据。
        Student student1 = new Student("龙利基斯",'男',19,"广州科技职业技术大学");
        System.out.println(student1);

        Student student2 = new Student("张家辉",'男',23,"广州科技职业技术大学");
        System.out.println(student2);
    }
}
