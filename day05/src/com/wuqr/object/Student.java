package com.wuqr.object;

public class Student {
    String name;
    double chinese;
    double english;

    public void allscores(){
        System.out.println(name + "的总成绩是：" + (chinese + english));
    }

    public void averagescores(){
        System.out.println(name + "的平均成绩是：" + (chinese + english)/2);
    }
}
