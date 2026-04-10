package org.example;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly payout: $");
        double monthlyPayment = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double monthlyRate = (annualInterestRate / 12) / 100;
        int totalMonths = years * 12;

        double presentValue = monthlyPayment * ((1 - Math.pow(1 + monthlyRate, - totalMonths)) / monthlyRate);

        System.out.println("Present value: $" + presentValue);
    }
}




