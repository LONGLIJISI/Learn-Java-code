package com.longlijisi;

public class ArrayTest6 {
    public static void main(String[] args) {
        //目标：完成数组华容道的初始化和随机乱序
        startGame(4);
    }

    public static void startGame(int num) {
        int[][] arr = new int[num][num];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        prinArray(arr);

        System.out.println("===============================================");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int m = (int)(Math.random() * arr.length);
                int n = (int)(Math.random() * arr.length);

                int temp = arr[i][j];
                arr[i][j] = arr[m][n];
                arr[m][n] = temp;
            }
        }

        prinArray(arr);
    }

    public static void prinArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
