package com.bridgelabz;

import java.util.Scanner;

public class StopWatch
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter B to begin the stopWatch :");
        long FirstClick = scanner.next().toUpperCase().charAt(0);
        long startTime = startStopWatch(FirstClick);
        System.out.println("press S to stop stopwatch: ");
        char endClick = scanner.next().toUpperCase().charAt(0);
        scanner.close();
        endStopWatch(startTime, endClick);
    }
    private static long startStopWatch(long FirstClick)
    {
        long startTime = 0;
        if(FirstClick == 'B')
        {
            startTime = System.currentTimeMillis();
            System.out.println(startTime);
        }
        return startTime;
    }
    private static void endStopWatch(long startTime, char endClick)
    {
        if(endClick == 'S')
        {
            long elapsedTime = System.currentTimeMillis() - startTime;
            System.out.println("Elapsed time in milliseconds :"+elapsedTime);
        }
    }
}
