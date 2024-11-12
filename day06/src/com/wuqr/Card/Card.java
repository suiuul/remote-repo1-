package com.wuqr.Card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String CarId;
    private String name;
    private String phone;
    private double money;

    public void deposit(double money){
        this.money += money;
    }

    public void consume(double money){
        this.money -= money;
    }
}
