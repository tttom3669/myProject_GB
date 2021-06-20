package com.tom.guess;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10)+1;//(0~9)+1
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (secret !=number){
            System.out.print("Please enter a number: ");
            number = scanner.nextInt();
            if (number < secret){
                System.out.println("Higher");
            }else if(number> secret){
                System.out.println("Lower");
            }else {
                System.out.println("Great,the number is: " + number);
            }
        }


        /*int i = 0;
        do{
            System.out.println(i);
            i++;//i= i +1;
        }while (i < 3);*/
    }
}
