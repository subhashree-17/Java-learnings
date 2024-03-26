package com.javalearnings.problems;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(1000);
        BankAccount checkingAccount = new CheckingAccount(500);

        savingsAccount.deposit(200);
        savingsAccount.withdraw(150);

        checkingAccount.deposit(300);
        checkingAccount.withdraw(200);

        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());
    }
}
