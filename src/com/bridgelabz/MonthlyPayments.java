package com.bridgelabz;

import java.util.Scanner;

public class MonthlyPayments
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter How many years to pay off :: ");
        double year = scanner.nextDouble();

        System.out.println("Enter the principal loan amount :: ");
        double principleAmount = scanner.nextDouble();

        System.out.println("Rate percentage ::");
        double rate = scanner.nextDouble();

        System.out.println("Monthly payment required: " + monthlyPayment(principleAmount, year, rate));
    }

    public static int monthlyPayment(double principleAmount, double year, double rate)
    {
        double r = rate / (12 * 100);
        double n = - 1* 12 * year;
        double payment = (principleAmount * r) / (1 - Math.pow((1 + r) , n));
        return (int)payment;
    }
}
