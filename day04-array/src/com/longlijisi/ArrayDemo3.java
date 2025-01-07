package com.longlijisi;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //目标：完成数组求最值。
        int[] scores = {15, 9000, 10000, 20000, 9500, -5};
        int max = getMax(scores);
        System.out.println("最大值是："+ max);
    }

    //设计一个方法，求数组的最大值返回。
    public static int getMax(int[] arr){
        //arr = {15, 9000, 10000, 20000, 9500, -5};
        //1.定义一个变量用于记录当前最大值，建议用第一个数据作为参照物。
        int max = arr[0];
        //2.遍历数组，依次和当前最大值比较，如果比当前大，则更新当前最大值。
        for (int i = 0; i <arr.length; i++) {
            int data = arr[i];
            if(data > max){
                max = data;
            }
        }
        return max;
    }
}
