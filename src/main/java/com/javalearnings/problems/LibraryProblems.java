package com.javalearnings.problems;
import java.util.Scanner;


public class LibraryProblems {
    private static int availableBooks = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAvailableBooks();
                    break;
                case 2:
                    borrowBook(scanner);
                    break;
                case 3:
                    returnBook(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the library system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Library System Menu");
        System.out.println("1. Display available books");
        System.out.println("2. Borrow a book");
        System.out.println("3. Return a book");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void displayAvailableBooks() {
        System.out.println("Available books: " + availableBooks);
    }

    private static void borrowBook(Scanner scanner) {
        if (availableBooks > 0) {
            System.out.print("Enter the number of books to borrow: ");
            int numBooks = scanner.nextInt();
            if (numBooks > availableBooks) {
                System.out.println("Insufficient books available.");
            } else {
                availableBooks -= numBooks;
                System.out.println("You have borrowed " + numBooks + " book(s).");
                displayAvailableBooks();
            }
        } else {
            System.out.println("No books available to borrow.");
        }
    }

    private static void returnBook(Scanner scanner) {
        System.out.print("Enter the number of books to return: ");
        int numBooks = scanner.nextInt();
        availableBooks += numBooks;
        System.out.println("You have returned " + numBooks + " book(s).");
        displayAvailableBooks();
    }

}

