package com.longlijisi.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //加油站支付小程序。
        //1.创建卡片类，以便创建金卡或者银卡对象，封装车主信息。
        //2.定义一个卡片父类：card，定义金卡的银卡的共同属性。
        //3.定义一个金卡类，继承card类：金卡必须重写消费方法（八折优惠），独有功能：消费满200，送免费洗车票。
        //4.定义一个银卡类，继承card类：银卡必须重写消费方法（九折优惠）
        //5.办一张金卡，创建金卡对象，交给一个独立的业务（支付机），来执行存款和消费功能。
        GoldCard goldCard = new GoldCard("粤RB2071","龙利基斯","13653001727",8000);
        pay(goldCard);
        //6.办一张银卡，创建银卡对象，交给一个独立的业务（支付机），来执行存款和消费功能。
        SliverCard sliverCard = new SliverCard("粤AD67O9","鼠鼠","18948773994",10000);
        pay(sliverCard);
    }

    //支付机：用一个方法来识别卡片类,通时判断该卡余额是否足够，足够则消费，不足则提示余额不足。
    public static void pay(Card card){
        System.out.println("欢迎使用支付机");
        System.out.println("您的余额为："+card.getBalance());
        System.out.println("请输入消费金额：");
        Scanner scanner = new Scanner(System.in);
        double balance = scanner.nextDouble();
        card.expense(balance);
    }
}
