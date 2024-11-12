package com.wuqr.Card;

import java.util.Scanner;

public class CardOperator {
    public CardOperator(Card c){
        System.out.println("请输入您的消费金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
    }
}
