package com.wuqr.Card;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        GoldCard a = new GoldCard("aaaaa", "aaa", "1111", 5000);
//        CardOperator pay_a = new CardOperator(a);
        pay(a);
        SilverCard b = new SilverCard("bbbbb", "bbb", "2222", 2300);
//        CardOperator pay_b = new CardOperator(b);
        pay(b);


    }
    public static void pay(Card c){
        System.out.println("请输入您的消费金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
    }

}
