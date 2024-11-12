package com.wuqr.array;

public class ArrayDemo {
    public static void main(String[] args) {
        name_random();
    }
    public static void name_random(){
        String[] names = {"qr","hr","aw","wr","xc","ss","ee"};
        int name = (int)(Math.random()*names.length);
        System.out.println(names[name]);
    }
}
