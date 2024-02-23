package com.javalearnings.Exception;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");

        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }

    public static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}