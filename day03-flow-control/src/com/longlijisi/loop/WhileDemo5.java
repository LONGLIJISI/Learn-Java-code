package com.longlijisi.loop;

public class WhileDemo5 {

//    //本金复利案例
//    public static void main(String[] args) {
//        System.out.println("需要" + calculateYears() + "才能实现本金翻倍");
//    }
//
//    public static int calculateYears() {
//        double principal = 100000;
//        double rate = 0.017;
//        double amount = principal;
//        int years = 0;
//
//        while (amount < 2*principal){
//            amount *= (1 + rate);
//            years++;
//        }
//        return years;
//    }


    //山峰高度折叠案例
    public static void main(String[] args) {
        System.out.println("纸张折叠" + calculatheights() + "次可以折成珠穆朗玛峰的高度");
    }

    public static int calculatheights(){
        double height = 8848860;
        double thickness = 0.1;
        int count = 0;

        while (thickness < height){
            thickness *= 2;
            count++;
        }
        return count;
    }
}
