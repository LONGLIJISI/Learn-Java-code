package com.longlijisi.method;

import java.util.Scanner;

public class HealthCalculator {
    public static void main(String[] args) {
        //目标：完成健康计算器。
        Scanner sc = new Scanner(System.in);
        //1.先让用户输入自己的年龄、性别、体重、身高。
        System.out.println("请输入您的年龄（岁）：");
        int age = sc.nextInt();

        System.out.println("请输入您的性别（男/女）：");
        String sex = sc.next();

        System.out.println("请输入您的体重（公斤）：");
        double weight = sc.nextDouble();

        System.out.println("请输入您的身高（米）：");
        double height = sc.nextDouble();

        double BMI = getBMI(weight, height);
        System.out.println("你的BMI值是：" + BMI);

        double bmr = getBMR(age, sex, height, weight);
        System.out.println("你的BMR值是：" + bmr);
    }
    //2.根据个人信息，计算出用户BMI指数（把数据交给一个独立的方法来计算并返回这个结果）
    public static double getBMI(double weight, double height) {
        return weight / (height * height);
    }
    //3.根据个人信息，计算出用户BMR指数（把数据交给一个独立的方法来计算并返回这个结果）
    public static double getBMR(int age, String sex, double height, double weight) {
        double bmr = 0;
        if ("男".equals(sex)) {
            bmr = 88.362 + (13.397 * weight) + (4.799 * (height * 100)) - (5.677 * age);
        } else {
            bmr = 447.593 + (9.6 * weight) + (1.8 * (height * 100)) - (4.7 * age);
        }
        return bmr;
    }
}




//最优写法



//public class HealthCalculator {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // 输入年龄
//        int age = 0;
//        while (true) {
//            System.out.print("请输入您的年龄（岁）：");
//            if (sc.hasNextInt()) {
//                age = sc.nextInt();
//                if (age > 0) break;
//            } else {
//                sc.next(); // 清除无效输入
//            }
//            System.out.println("输入无效，请输入一个正整数。");
//        }
//
//        // 输入性别
//        String sex = "";
//        while (true) {
//            System.out.print("请输入您的性别（男/女）：");
//            sex = sc.next();
//            if (sex.equals("男") || sex.equals("女")) break;
//            System.out.println("输入无效，请输入 '男' 或 '女'。");
//        }
//
//        // 输入体重
//        double weight = 0;
//        while (true) {
//            System.out.print("请输入您的体重（公斤）：");
//            if (sc.hasNextDouble()) {
//                weight = sc.nextDouble();
//                if (weight > 0) break;
//            } else {
//                sc.next(); // 清除无效输入
//            }
//            System.out.println("输入无效，请输入一个正数。");
//        }
//
//        // 输入身高
//        double height = 0;
//        while (true) {
//            System.out.print("请输入您的身高（米）：");
//            if (sc.hasNextDouble()) {
//                height = sc.nextDouble();
//                if (height > 0) break;
//            } else {
//                sc.next(); // 清除无效输入
//            }
//            System.out.println("输入无效，请输入一个正数。");
//        }
//
//        // 计算 BMI 和 BMR
//        double BMI = getBMI(weight, height);
//        double bmr = getBMR(age, sex, height, weight);
//
//        // 输出结果
//        System.out.printf("你的BMI值是：%.2f%n", BMI);
//        System.out.printf("你的BMR值是：%.2f%n", bmr);
//
//        // 提供健康建议
//        if (BMI < 18.5) {
//            System.out.println("您处于偏瘦状态。");
//        } else if (BMI < 24.9) {
//            System.out.println("您的体重正常。");
//        } else if (BMI < 29.9) {
//            System.out.println("您处于超重状态。");
//        } else {
//            System.out.println("您处于肥胖状态，请注意健康。");
//        }
//
//        // 关闭 Scanner
//        sc.close();
//    }
//
//    // 计算 BMI
//    public static double getBMI(double weight, double height) {
//        return weight / (height * height);
//    }
//
//    // 计算 BMR
//    public static double getBMR(int age, String sex, double height, double weight) {
//        double bmr = 0;
//        if ("男".equals(sex)) {
//            bmr = 88.362 + (13.397 * weight) + (4.799 * (height * 100)) - (5.677 * age);
//        } else {
//            bmr = 447.593 + (9.6 * weight) + (1.8 * (height * 100)) - (4.7 * age);
//        }
//        return bmr;
//    }
//}
