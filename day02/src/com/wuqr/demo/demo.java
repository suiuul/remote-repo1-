package com.wuqr.demo;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身高");
        double height = sc.nextDouble();
        System.out.println("请输入你的体重");
        double weight = sc.nextDouble();
        System.out.println("请输入你的性别（男/女）");
        String gender = sc.next();
        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        System.out.println("--------------------");
        System.out.println("你的BMI指数为：" + BMIcal(height, weight));
        System.out.println("--------------------");
        System.out.println("你的基础代谢率为：" + BMRcal(weight, height, age, gender));
    }

    public static double BMIcal(double height, double weight){
        double bmi = weight / (height * height);
        return bmi;
    }

    public static double BMRcal(double weight, double height, int age, String gender){
        double bmr = 0;
        if(gender.equals("男")){
            bmr = 10 * weight + 6.25 * height - 5 * age + 5;
        }else if(gender.equals("女")){
            bmr = 10 * weight + 6.25 * height - 5 * age - 161;
        }
        return bmr;
    }
}
