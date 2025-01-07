package com.longlijisi;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 目标：二维数组的认识
        printArray();
        printArray2();
    }

    public static void printArray() {
        //初始化二维数组存储学生姓名，考虑到座位不规则，直接定义每排座位
        //静态数组化
        String[][] classroom = {
                {"张无忌","赵敏","周芷若"},//
                {"张三丰","宋远桥","龙利基斯"},
                {"灭绝师太","玄冥二老","金毛狮王","陈坤"},
                {"杨潇","纪晓芙"}
        };

        // 访问:数组名[行索引]
        String[] names = classroom[2];
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("===================================");

        //访问2：数组名[列索引]
        System.out.println(classroom[1][1]);
        System.out.println(classroom[2][2]);

        System.out.println("====================================");

        //长度访问：数组名.length

        //动态化数组
        int [][] arr = new int [3][5];
        System.out.println("====================================");
    }

    public static void printArray2(){
        String [][] classroom = {
                {"张无忌","赵敏","周芷若"},//
                {"张三丰","宋远桥","龙利基斯"},
                {"灭绝师太","玄冥二老","金毛狮王","陈坤"},
                {"杨潇","纪晓芙"}
        };

        for (int i = 0; i < classroom.length; i++) {
            String[] names = classroom[i];
            for (int j = 0; j < names.length; j++) {
                System.out.print(names[j]+ "\t");
            }
            System.out.println();
        }

        System.out.println("================另一种遍历方式=========== ======");

        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                System.out.print(classroom[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
