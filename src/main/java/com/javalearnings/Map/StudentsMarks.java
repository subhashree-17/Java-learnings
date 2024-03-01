package com.javalearnings.Map;
import java.util.*;
public class StudentsMarks {
    public static void main(String[] args) {

        Map<String, Integer> StudentMarks = new HashMap<>();


        StudentMarks.put("shree", 85);
        StudentMarks.put("kabe", 90);
        StudentMarks.put("giri", 75);
        StudentMarks.put("surya", 80);
        StudentMarks.put("jayasurya", 95);


        String studentName = "giri";
        System.out.println(studentName + "'s grade: " + StudentMarks.get(studentName));


        System.out.println("Student marks:");
        for (Map.Entry<String, Integer> entry : StudentMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String searchName = "kabe";
        if (StudentMarks.containsKey(searchName)) {
            System.out.println(searchName + " is present in the map.");
        } else {
            System.out.println(searchName + " is not present in the map.");
        }


        String removeName = "arun";
        if (StudentMarks.containsKey(removeName)) {
            StudentMarks.remove(removeName);
            System.out.println(removeName + " has been removed from the map.");
        } else {
            System.out.println(removeName + " is not present in the map.");
        }


        System.out.println("Size of the map: " + StudentMarks.size());
    }

}
