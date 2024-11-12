package com.wuqr.test;

import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        guess();
    }
    public static void guess(){
        Random r = new Random();
        int g = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the number you guess");
        while (true){
            int num = sc.nextInt();
            if(num == g) {
                System.out.println("you are right");
                break;
            }else if(num < g){
                System.out.println("you guess small, please guess again");
            }else{
                System.out.println("you guess big, please guess again");
            }
        }
    }
}
