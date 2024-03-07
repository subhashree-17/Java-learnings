package com.javalearnings.problems;


public class MaxNumInArray {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 15};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number in the array: " + max);
    }

}
