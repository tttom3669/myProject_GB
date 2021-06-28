package com.tom.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        //userInput();
        //com.tom.kotlin.Student.getPass();
        Student.pass = 50;
        Student stu = new Student("Eric",77,99);
        Student stu2 = new Student("Hank",60,40);
        Student stu3 = new Student("Jane",30,55);
        GraduateStudent gtsu = new GraduateStudent("Jack",60,60,60);
        gtsu.print();
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score: " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter student's name: ");
        String name = scanner.next();

        System.out.print("Please enter student's english: ");
        int english = scanner.nextInt();

        System.out.print("Please enter student's math: ");
        int math = scanner.nextInt();

        Student stu = new Student(name,english,math);
        stu.print();
        System.out.println("High score: " + stu.highest());
    }
}
