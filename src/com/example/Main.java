package com.example;

import com.example.common.Month;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

        ArrayList<String> months = new ArrayList<String>();

        switch(input) {
            case "January":
                months.add(Month.JANUARY.getEnglishName());
            case "February":
                months.add(Month.FEBRUARY.getEnglishName());
            case "March":
                months.add(Month.MARCH.getEnglishName());
            case "April":
                months.add(Month.APRIL.getEnglishName());
            case "May":
                months.add(Month.MAY.getEnglishName());
            case "June":
                months.add(Month.JUNE.getEnglishName());
            case "July":
                months.add(Month.JULY.getEnglishName());
            case "August":
                months.add(Month.AUGUST.getEnglishName());
            case "September":
                months.add(Month.SEPTEMBER.getEnglishName());
            case "October":
                months.add(Month.OCTOBER.getEnglishName());
            case "November":
                months.add(Month.NOVEMBER.getEnglishName());
            case "December":
                months.add(Month.DECEMBER.getEnglishName());
                break;
            default:
                months.add("No matching month!");
        }
        System.out.println(months);


        // EXTRAS

        File newFile = new File("may.json");

        try {
            FileWriter fileWriter = new FileWriter(newFile);
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(Month.MAY);
            fileWriter.write(json);
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
