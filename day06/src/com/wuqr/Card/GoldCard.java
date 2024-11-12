package com.wuqr.Card;

public class GoldCard extends Card{
    public GoldCard(String CarId, String name, String phone, double money) {
        super(CarId, name, phone, money);
    }
    public GoldCard(){

    }

    @Override
    public void consume(double money){
        System.out.println("您当前消费：" + money);
        System.out.println("优惠后的价格是：" + money * 0.8);
        if (getMoney() < money*0.8){
            System.out.println("您的余额不足，请充值");
            return;
        }
        setMoney(getMoney() -money*0.8);
        if (money * 0.8 > 200){
            System.out.println("送您一张免费洗车券");
        }else {
            System.out.println("您的消费金额不足200，无法获得免费洗车券");
        }
    }
}
