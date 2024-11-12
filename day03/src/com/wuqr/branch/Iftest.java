package com.wuqr.branch;
import java.util.Scanner;
public class Iftest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        test1();
    }
    public static void test1(){
        boolean green = true;
        boolean yellow = false;
        boolean red = false;

        if (green){
            System.out.println("绿灯，请通行");
        }else if (yellow){
            System.out.println("黄灯，请停止");
        }else if (red){
            System.out.println("红灯，请停止");
        }else {
            System.out.println("灯泡故障，请停止");
        }
    }
}
