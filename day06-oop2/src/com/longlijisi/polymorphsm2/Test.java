package com.longlijisi.polymorphsm2;

public class Test {
    public static void main(String[] args) {
        //目标：认识多态的代码。
        //1.对象多态。
//        Animal animal = new Wolf();
//        animal.run();
//        System.out.println(animal.name);
//
//        Animal animal2 = new Tortoise();
//        animal2.run();
//        System.out.println(animal2.name);



        //2.多态的好处：

        Animal animal = new Animal();
        animal.run();
//        a1.shrinkHead();//多态下的一个问题，多态下不能调用子类的功能。
        //  1.右边对象时解耦合的，即可模块化、可替换。
        Wolf wolf = new Wolf();
        go(wolf);

        Tortoise tortoise = new Tortoise();
        go(tortoise);
    }

        //宠物游戏，所有动物都可以送给这个方法开始跑步。
        //  2.父类类型的变量作为参数，可以接受一个子类对象。
    public static void go(Animal animal){
        System.out.println("开始~~~~");
        animal.run();
    }
}




