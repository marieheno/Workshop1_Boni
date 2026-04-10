package org.example;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount: $");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate: " );
        double annualRate = input.nextDouble();

        System.out.print("Enter loan length in years: ");
        int years = input.nextInt();

        double monthlyRate = (annualRate / 12) / 100;
        int numberOfPayment = years * 12;

        double M = principal * ((monthlyRate * Math.pow(1 + monthlyRate, numberOfPayment)) / (Math.pow(1 + monthlyRate, numberOfPayment) - 1));


        double totalInterest = (M * numberOfPayment) - principal;

        System.out.println("Monthly payment: $" + M);
        System.out.println("Total interest paid: $" + totalInterest);

    }
}
