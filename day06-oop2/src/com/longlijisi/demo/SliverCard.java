package com.longlijisi.demo;

public class SliverCard extends Card{
    public SliverCard(String cardId, String username, String phoneNumber, double balance) {
        super(cardId, username, phoneNumber, balance);
    }

    @Override
    public void expense(double balance){
        System.out.println("您的银卡当前消费：" + balance);
        System.out.println("优惠后的价格：" + balance * 0.9);
        //判断余额是否充足。
        if (getBalance() < balance * 0.9){
            System.out.println("您的余额："+ getBalance() + "，支付失败。");
            return;
        }
        //更新银卡消费后的账户余额。
        setBalance(getBalance() - balance * 0.9);
    }
}
