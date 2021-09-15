package com.bridgelabz;

import java.util.Scanner;

public class TemparatureConversion
{
    public static void main(String[] args)
    {
        double fahrenheit,celsius;
        System.out.println("1) fahrenheit to Celsius");
        System.out.println("2) Celsius to  fahrenheit");
        System.out.println("3) Exit");

        Scanner scanner = new Scanner(System.in);
        int ch=scanner.nextInt();

        switch (ch)
        {
            case 1:
                System.out.println("Enter Fahrenheit :: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit-32) * 5/9;
                System.out.println("conversion of given temprature is :: "+celsius);
                break;
            case 2:
                System.out.println("Enter Celsius :: ");
                celsius = scanner.nextDouble();
                fahrenheit = (celsius* 9/5)+ 32;
                System.out.println("conversion of given temprature is :: "+fahrenheit);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("You entered a wrong input");
                break;
        }
        scanner.close();

    }
}
