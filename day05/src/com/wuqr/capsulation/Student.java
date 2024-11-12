package com.wuqr.capsulation;

public class Student {
    private String name;
    private int age;
    private double chinese;
    private double math;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age < 0 && age > 200){
            System.out.println("your age is wrong, please set again");
        }else {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    public void setChinese(double chinese){
        if(chinese > 0 && chinese < 100){
            this.chinese = chinese;
        }else {
            System.out.println("your chinese is wrong, please set again");
        }
    }

    public double getChinese(){
        return  chinese;
    }

    public void setMath(double math){
        if(math > 0 && math < 100){
            this.math = math;
        }else {
            System.out.println("your math is wrong, please set again");
        }
    }

    public double getMath(){
        return  math;
    }

    public Student(){
        System.out.println("====这是一个无参构造函数======");
    }

    public Student(String name, int age, double chinese, double math){
        System.out.println("=====这是一个有参构造函数=====");
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
    }

    public void allscores(){
        System.out.println(name + '\t' + "all scores is " + (chinese + math));
    }

    public void averagescores(){
        System.out.println(name + '\t' + "average scores is " + (chinese + math)/2);
    }
}
