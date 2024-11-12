package com.wuqr.loop;

public class ForforDemo {
    public static void main(String[] args) {
        test();
        print99();
    }
    public static void test(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void print99(){
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + "x" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
    }
}
