package com.longlijisi.loop;

public class ForTest2 {
//    public static void main(String[] args) {
//        test1();
//    }
//    public static void test1(){
//        int sum = 0;
//        for (int i = 0; i < 6; i++) {
//            sum += i;
//        }
//        System.out.println("0 到 5 的和是："+ sum);
//    }

    //更优写法

    public static void main(String[] args) {
        System.out.println("0 到 5 的和是：" + sum(0,5));
    }
    public static int sum(int start,int end){
        int total = 0;
        for(int i = start ; i <= end ;i++ ){
            total += i;
        }
        return total;
    }
}
