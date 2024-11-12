package com.wuqr.Card;

public class SilverCard extends Card{

    public SilverCard(String CarId, String name, String phone, double money) {
        super(CarId, name, phone, money);
    }
    public SilverCard(){

    }

    @Override
    public void consume(double money){
        System.out.println("您的消费金额是：" + money);
        System.out.println("优惠后金额是：" + money * 0.9);
        if (getMoney() < money * 0.9){
            System.out.println("您的余额不足，请充值");
            return;
        }
        setMoney(getMoney()-money*0.9);
    }

}
