package com.wuqr.test;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input first number");
        double num1 = sc.nextDouble();
        System.out.println("please input second number");
        double num2 = sc.nextDouble();
        System.out.println("please choose your operator");
        String operator = sc.next();
        System.out.println("your result is " + result(num1, num2, operator));
    }
    public static double result(double num1, double num2, String operator){
        double res = 0;
        switch (operator){
            case "+": res = num1 + num2;
            break;
            case "-": res = num1 - num2;
            break;
            case "*": res = num1 * num2;
            break;
            case "/": res = num1 / num2;
            default:
                System.out.println("your operator is wrong");
        }
        return res;
    }

}
