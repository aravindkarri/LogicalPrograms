package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not");
        int number = scanner.nextInt();
        scanner.close();
        boolean flag = true;
        for (int i=2; i<=number/2; i++)
        {
            if (number%i ==0)
            {
                flag = false;
            }
        }
        if (flag == true)
        {
            System.out.println("it is a prime number");
        }
        else
        {
            System.out.println("it is not a prime number");
        }
    }
}
