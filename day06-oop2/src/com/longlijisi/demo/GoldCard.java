package com.longlijisi.demo;

public class GoldCard extends Card{
    public GoldCard(String cardId, String username, String phoneNumber,double balance) {
        super(cardId, username, phoneNumber, balance);
    }

    @Override
    public void expense(double balance) {
        System.out.println("您的金卡当前消费："+ balance);
        System.out.println("优惠后的价格："+ balance * 0.8);
        //判断余额是否充足。
        if (getBalance() < balance * 0.8){
            System.out.println("您的余额："+ getBalance() + "，支付失败。");
            return;
        }
        //更新金卡的账户余额。
        setBalance(getBalance() - balance * 0.8);
        //判断消费：如果消费大于200，调用一个独有的功能，打印洗车票。
        if( balance * 0.8 >= 200){
            printTicket();
        }else {
            System.out.println("您消费未满200,洗车票需另外购买。");
        }
    }

    //打印洗车票。
    public void printTicket(){
        System.out.println("您消费超过了200，可以免费获得一张洗车票嗷！");
    }
}
