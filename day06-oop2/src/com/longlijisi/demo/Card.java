package com.longlijisi.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok 可以实现为类自动添加get set方法、无参数构造器、toString方法等。
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String cardId;
    private String username;
    private String phoneNumber;
    private double balance;

    //预存金额。
    public void deposit(double balance){
        this.balance += balance;
    }
    //消费金额。
    public void expense(double balance){
        this.balance -= balance;
    }
}
