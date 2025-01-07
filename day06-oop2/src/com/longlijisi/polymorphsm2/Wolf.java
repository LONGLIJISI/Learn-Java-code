package com.longlijisi.polymorphsm2;

public class Wolf extends Animal {
    String name = "狼";
    @Override
    public void run() {
        System.out.println("狼的奔跑速度非常快~~~");
    }

    public void eatsheeper() {
        System.out.println("喜欢吃羊");
    }
}
