package com.longlijisi.loop;

public class ForTest3 {
    public static void main(String[] args) {
        System.out.println("1 到 10 的奇数和是："+ sum(1,10));
    }
    public static int sum(int start,int end){
        int total = 0;
        for (int i = start; i <= end ; i++) {
            if(i % 2 == 1){
                total += i;
            }
        }
        return total;
    }
}
