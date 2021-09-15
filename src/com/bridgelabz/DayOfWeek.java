package com.bridgelabz;

import java.util.Scanner;

public class DayOfWeek
{
    public static void main(String[] args)
    {

        int month, day, year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Day ::");
        day = scanner.nextInt();
        System.out.println("Enter Month ::");
        month = scanner.nextInt();
        System.out.println("Enter Year ::");
        year = scanner.nextInt();

        if (day >= 1 && day <= 31 || month >= 1 && month <= 12)
        {
            int y = year - (14 - month) / 12;
            int x = y + y / 4 - y / 100 + y / 400;
            int m = month + 12 * ((14 - month) / 12) - 2;
            int d = (day + x + 31 * m / 12) % 7;


            switch (d)
            {
                case 0:
                    System.out.println("You just Entered " + (d + 1) + "st day of week i.e  Sunday");
                    break;
                case 1:
                    System.out.println("You just Entered " + (d + 1) + "nd day of week i.e  Monday");
                    break;
                case 2:
                    System.out.println("You just Entered " + (d + 1) + "rd day of week i.e  Tuesday");
                    break;
                case 3:
                    System.out.println("You just Entered " + (d + 1) + "th day of week i.e  wednesday");
                    break;
                case 4:
                    System.out.println("You just Entered " + (d + 1) + "th day of week i.e  thursday");
                    break;
                case 5:
                    System.out.println("You just Entered " + (d + 1) + "th day of week i.e  Firday");
                    break;
                case 6:
                    System.out.println("You just Entered " + (d + 1) + "th day of week i.e saturday");
                    break;
                default:
                    System.out.println("Something Wrong happened");
            }
        }
    }
}
