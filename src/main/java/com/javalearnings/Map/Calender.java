package com.javalearnings.Map;
import java.util.*;


public class Calender {
    public static void main(String[] args) {

        Map<String, Integer> monthDays = new LinkedHashMap<>();


        monthDays.put("January", 31);
        monthDays.put("February", 28);
        monthDays.put("March", 31);
        monthDays.put("April", 30);
        monthDays.put("May", 31);


        String month = "March";
        System.out.println("Number of days in " + month + ": " + monthDays.get(month));


        System.out.println("Month Days:");
        for (Map.Entry<String, Integer> entry : monthDays.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " days");
        }


        String searchMonth = "April";
        if (monthDays.containsKey(searchMonth)) {
            System.out.println(searchMonth + " exists in the LinkedHashMap.");
        } else {
            System.out.println(searchMonth + " does not exist in the LinkedHashMap.");
        }


        String removeMonth = "February";
        if (monthDays.containsKey(removeMonth)) {
            monthDays.remove(removeMonth);
            System.out.println(removeMonth + " has been removed from the LinkedHashMap.");
        } else {
            System.out.println(removeMonth + " does not exist in the LinkedHashMap.");
        }


        System.out.println("Size of the LinkedHashMap: " + monthDays.size());
    }

}

