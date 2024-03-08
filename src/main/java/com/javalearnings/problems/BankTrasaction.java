package com.javalearnings.problems;

import java.util.Scanner;

public class BankTrasaction {
    private static double balance = 10000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Bank Transaction System");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositAmount(scanner);
                    break;
                case 3:
                    withdrawAmount(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using our service. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    private static void depositAmount(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double deposit = scanner.nextDouble();
        balance += deposit;
        System.out.println("$" + deposit + " deposited successfully.");
        System.out.println("Your updated balance is: $" + balance);
    }

    private static void withdrawAmount(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double withdraw = scanner.nextDouble();
        if (withdraw > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= withdraw;
            System.out.println("$" + withdraw + " withdrawn successfully.");
            System.out.println("Your updated balance is: $" + balance);
        }
    }

}
