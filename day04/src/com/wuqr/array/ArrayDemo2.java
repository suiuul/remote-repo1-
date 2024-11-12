package com.wuqr.array;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        //动态分配数组
        double[] scores = new double[8];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("please input" + (i + 1) + "score");
            scores[i] = sc.nextDouble();
        }

        double allscores = scores[0];
        double maxsocre = scores[0];
        double minscore = scores[0];

        for (int i = 1; i < scores.length; i++) {
            double score = scores[i];
            allscores += score;

            if (score > maxsocre){
                maxsocre = score;
            }

            if (score < minscore){
                minscore = score;
            }
        }
        System.out.println("average is " + allscores / scores.length);
        System.out.println("the max score is" + maxsocre);
        System.out.println("the min score is" + minscore);
    }
}
