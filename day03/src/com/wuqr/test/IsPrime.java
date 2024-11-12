package com.wuqr.test;

public class IsPrime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++){
            if(Isprime(i)){
            System.out.println(i);
            count++;
            }
        }
    }

    public static boolean Isprime(int num){
        for (int i = 2 ; i < num/2; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
