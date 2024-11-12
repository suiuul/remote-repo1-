package com.wuqr.test;

public class yanzhenma {
    public static void main(String[] args) {
        System.out.println("yanzhenma is:" + yanzhenma(3));
    }
    public static String yanzhenma(int n){
        String code = "";

        for (int i = 0; i < n; i++){
            int type = (int)(Math.random()*3);
            switch (type){
                case 0:
                    int num1 = (int)(Math.random()*10);
                    code += num1;
                    break;
                case 1:
                    int num2 = (int)(Math.random()*26)+1;
                    char ch1 = (char)('a'+num2);
                    code += ch1;
                    break;
                case 2:
                    int num3 = (int)(Math.random()*26)+1;
                    char ch2 = (char)(97 + num3);
                    code += ch2;
                    break;
            }
        }
        return  code;
    }
}
