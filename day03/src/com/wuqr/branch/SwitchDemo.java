package com.wuqr.branch;
import javax.swing.*;
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        Switch_test();
    }
    public static void Switch_test(){
        System.out.println("请输入你的性别");
        Scanner sc = new Scanner(System.in);
        String gender = sc.next();
        switch (gender){
            case "男" :
                System.out.println("男");
                break;
            case "女" :
                System.out.println("女");
                break;
            default:
                System.out.println("怪物");
        }
    }
}
