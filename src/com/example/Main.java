package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // display all the English month names
        for( Month m: Month.values() ) {
            System.out.println(m.getEnglishName());
        }

        System.out.println("Please choose a month:");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayList<Month> months = new ArrayList<Month>();

        switch(input) {
            case "January":
                months.add(Month.JANUARY);
            case "February":
                months.add(Month.FEBRUARY);
            case "March":
                months.add(Month.MARCH);
            case "April":
                months.add(Month.APRIL);
            case "May":
                months.add(Month.MAY);
            case "June":
                months.add(Month.JUNE);
            case "July":
                months.add(Month.JULY);
            case "August":
                months.add(Month.AUGUST);
            case "September":
                months.add(Month.SEPTEMBER);
            case "October":
                months.add(Month.OCTOBER);
            case "November":
                months.add(Month.NOVEMBER);
            case "December":
                months.add(Month.DECEMBER);
        }
        System.out.println(months);
    }
}
