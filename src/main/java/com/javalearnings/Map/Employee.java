package com.javalearnings.Map;
import java.util.Map;
import java.util.TreeMap;

public class Employee {
    public static void main(String args[]) {
        TreeMap<Integer, String> employeeMap;
        employeeMap = new TreeMap<>();

        employeeMap.put(101, "shree");
        employeeMap.put(103, "Gopi");
        employeeMap.put(104, "Surya");
        employeeMap.put(105, "arun");
        employeeMap.put(102, "giri");
        employeeMap.put(106, "kabe");

        int employeeID = 103;
        System.out.println("Name of the employee with ID" + employeeID + ":" + employeeMap.get(employeeID));

        System.out.println("Employee List");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        int searchID = 102;
        if (employeeMap.containsKey(searchID)) {
            System.out.println("Employee with ID " + searchID + " exists in the TreeMap.");
        } else {
            System.out.println("Employee with ID " + searchID + " does not exist in the TreeMap.");
        }
        int removeID = 105;
        if (employeeMap.containsKey(removeID)) {
            employeeMap.remove(removeID);
            System.out.println("Employee with ID " + removeID + " has been removed from the TreeMap.");
        } else {
            System.out.println("Employee with ID " + removeID + " does not exist in the TreeMap.");
        }
        System.out.println("Size of the TreeMap: " + employeeMap.size());
    }



}
