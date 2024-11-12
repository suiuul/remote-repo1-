package com.wuqr.object;

public class test_student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "wuqr";
        s1.chinese = 99;
        s1.english = 98;
        s1.allscores();
        s1.averagescores();

        Student s2 = new Student();
        s2.name = "sdf";
        s2.chinese = 97;
        s2.english =66;
        s2.allscores();
        s2.averagescores();
    }

}
