package com.longlijisi.extends5override;

public class Test2 {
    public static void main(String[] args) {
        //目标：方法重写的常见应用场景：子类重写object的toString方法，以便返回对象的内容。
        Student student = new Student("龙利基斯",'男',23);
        System.out.println(student.toString());//com.longlijisi.extends5override.Student@2f4d3709
        System.out.println(student);//com.longlijisi.extends5override.Student@2f4d3709
        //注意1：直接输出对象，默认会调用object的toString方法（可以省略不写调用toString的代码），返回对象的地址信息。
        //注意2：输出对象的地址实际上是没有什么意义的，开发中更希望输出对象时，看对象的内容信息，所以子类需要重写Object的toString方法，
        //      以便以后输出对象时，默认就近调用子类重写的toString方法返回对象的内容。
    }
}

class Student {
    private String name;
    private char sex;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public Student() {

    }

    public Student(String name, char sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
