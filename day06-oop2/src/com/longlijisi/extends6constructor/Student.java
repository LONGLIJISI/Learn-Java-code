package com.longlijisi.extends6constructor;

public class Student {
    private String name;
    private char sex;
    private int age;
    private String schoolName;

    public Student() {
    }

    public Student(String name, char sex, int age) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;

        //this调用 兄弟构造器。
        //注意：super(...)、this(...)必须写在构造器的第一行，而且两者不能同时出现。
        this(name,sex,age,"广州科技职业技术大学");
    }

    public Student(String name, char sex, int age, String schoolName) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
