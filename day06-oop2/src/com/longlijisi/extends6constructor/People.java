package com.longlijisi.extends6constructor;
//父类
//继承的好处：1.代码服用 2.减少重复代码。
public class People {
    private String name;
    private char sex;

    public People() {

    }

    public People(String name, char sex) {
        this.name = name;
        this.sex = sex;
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
