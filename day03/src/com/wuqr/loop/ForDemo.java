package com.wuqr.loop;
import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        System.out.println(sum(10));;
    }
    public static int sum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i +=2){
            sum += i;
        }
        return sum;
    }
}
