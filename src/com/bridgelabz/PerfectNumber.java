package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is perfect number on not ::");
        int number = scanner.nextInt();
        scanner.close();
        int factorsSum=0;
        for(int i=1; i<=number/2; i++)
        {
            if (number%i == 0)
            {
                factorsSum += i;
            }
        }
        if (factorsSum == number)
        {
            System.out.println("It is a perfect number");

        }
        else {
            System.out.println("it is not a perfect number");
        }
    }
}
