package com.company;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Bennett",3.4);
        Student s2 = new Student("Bryce",4.1);
        Student s3 = new Student("Farraz", 2.0);

        System.out.println(Student.highestGPA + " is the highest GPA.");
        System.out.println(Student.secondGPA + " is the second highest GPA.");
        System.out.println(Student.thirdGPA + " is the third highest GPA.");

    }
}
