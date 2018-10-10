package com.company;

/**
 * Created by pg304 on 10/10/18.
 */
public class Student {
    public String name;
    public double GPA;
    public static double highestGPA = 0;
    public static double secondGPA = 0;
    public static double thirdGPA = 0;

    public Student (String n, double g) {
        name = n;
        GPA = g;
        if (GPA > highestGPA) {
            thirdGPA = secondGPA;
            secondGPA = highestGPA;
            highestGPA = GPA;
        }
        else if (GPA > secondGPA) {
            thirdGPA = secondGPA;
            secondGPA = GPA;
        }
        else if (GPA > thirdGPA) {
            thirdGPA = GPA;
        }
    }
}
