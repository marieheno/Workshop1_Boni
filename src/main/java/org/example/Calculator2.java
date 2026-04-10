package org.example;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial deposit: ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double annualRateDecimal = annualInterestRate / 100;

        int interestCompoundedPerYear = 365;

        double futureValue = principal * Math.pow(( 1 + annualRateDecimal / 365), 365 * years);

        double totalInterestEarned = futureValue - principal;

        System.out.println("Future value: $" + futureValue);
        System.out.println("Total interest earned: $" + totalInterestEarned);
    }
}
