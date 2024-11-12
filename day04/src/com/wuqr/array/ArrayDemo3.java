package com.wuqr.array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        doudizhu();
    }
    public static void doudizhu(){
        String[] poker = new String[54];

        String[] huase = new String[]{"黑桃","红心","梅花","方块"};

        String[] daxiao = new String[]{"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        int m = 0;
        for (int i = 0; i < daxiao.length; i++){
            for (int j = 0; j < huase.length; j++){
                poker[m] = huase[j] + daxiao[i];
                m++;
            }
        }

        poker[m++] = "小王";
        poker[m] = "大王";

        System.out.println("新牌");
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + "\t");
        }
        System.out.println();

        System.out.println("洗牌后");

        for (int i = 0; i < poker.length; i++){
            int index1 = (int)(Math.random()* poker.length);
            int index2 = (int)(Math.random()* poker.length);

            String temp = poker[index2];
            poker[index2] = poker[index1];
            poker[index1] = temp;
        }

        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i] + "\t");
        }
        System.out.println();
    }
}
