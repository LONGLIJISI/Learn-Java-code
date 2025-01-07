package com.longlijisi.demo;

public class Test4 {
    public static void main(String[] args) {
        //目标：找出101-200之间的全部素数。
        //1.遍历1011-200
        for (int i = 101; i <= 200 ; i++) {
            //i= 101、102、103 ...200
            //2、每遍历到一个数字，判断这个数字是否为素数，是则输出。
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num){
        //定义一个循环从2开始找到该数的一半，只要发现有一个数字能整除num这个数，num就不是素数
        //如果没有找到，那么num就是素数
        for (int i = 2; i <= num / 2 ; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;//是素数。
    }
}
