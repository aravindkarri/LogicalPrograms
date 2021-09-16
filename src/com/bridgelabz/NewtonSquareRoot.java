package com.bridgelabz;

import java.util.Scanner;

public class NewtonSquareRoot
{
    public static final double epsilon = 1e-15;
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter non negative number ::");
        int number = scanner.nextInt();
        scanner.close();
        double root = number;
        while(Math.abs(root-number/root) > epsilon * root)
        {
            root = (number/root+root)/2;
        }
        System.out.println("The square root of the number is " +root);
    }
}
