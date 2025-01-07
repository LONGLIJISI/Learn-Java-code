package com.longlijisi.polymorphsm1;

public class Test {
    public static void main(String[] args) {
        //目标：认识多态的代码。
        //1.对象多态。
        Animal animal = new Wolf();
        animal.run();
        System.out.println(animal.name);

        Animal animal2 = new Tortoise();
        animal2.run();
        System.out.println(animal2.name);
    }
}


