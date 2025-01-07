package com.longlijisi.polymorphsm1;

public class Wolf extends Animal {
    String name = "狼";
    @Override
    public void run() {
        System.out.println("狼的奔跑速度非常快~~~");
    }
}
