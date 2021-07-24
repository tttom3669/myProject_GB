package com.tom.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
        int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        Calendar now = Calendar.getInstance();
//        System.out.println(now.get(Calendar.DAY_OF_YEAR));
//        System.out.println(now.isLenient());//是否是閏年
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;//回傳(0-11)+1
        int day = now.get(Calendar.DAY_OF_MONTH);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Please enter year: ("+ year +")");
            String yearString = reader.readLine();
            year = (yearString.length() > 0) ? Integer.parseInt(yearString) : year;
            /*if (yearString.length() > 0) {
                year = Integer.parseInt(yearString);
            }*/
            System.out.println(year);

            System.out.print("Please enter month: ("+ month +")");
            String monthString = reader.readLine();
            month = (monthString.length() > 0) ? Integer.parseInt(monthString) : month;
            /*if (monthString.length() > 0) {
                month = Integer.parseInt(monthString);
            }*/
            System.out.println(month);

            System.out.print("Please enter year: ("+ day +")");
            String dayString = reader.readLine();
            day = (dayString.length() > 0) ? Integer.parseInt(dayString) : day;
            /*if (dayString.length() > 0) {
                day = Integer.parseInt(dayString);
            }*/
            System.out.println(day);
            int days = 0;
            for (int i=0; i<month-1;i++){
                days += months[i];
            }
            if (year % 400 == 0 ||(year % 4 == 0 && year%100 != 0)){
                days++;
            }
            days += day;
            System.out.println(days);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
