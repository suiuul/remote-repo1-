package com.wuqr.capsulation;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 11, 93,95);
        System.out.println(s1.getAge());
        System.out.println(s1.getMath());
        s1.allscores();
        s1.averagescores();

        Student s2 = new Student();
        s2.setAge(17);
        s2.setChinese(98);
        s2.setMath(88);
        s2.setName("lisi");
        System.out.println(s2.getAge());
        System.out.println(s2.getMath());
        s2.allscores();
        s2.averagescores();
    }
}
