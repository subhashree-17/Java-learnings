package com.javalearnings.problems;

import java.io.File;
import java.util.Scanner;

public class FileNotFoundException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the file path: ");
            String filePath = scanner.nextLine();

            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (Exception e) {
            System.out.println("Error: Something went wrong.");
        } finally {
            scanner.close();
        }
    }
}

