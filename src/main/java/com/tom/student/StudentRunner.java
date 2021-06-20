package com.tom.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        //userInput();
        Student stu = new Student("Tom",77,99);
        stu.print();
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
