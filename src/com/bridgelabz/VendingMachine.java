package com.bridgelabz;

import java.util.Scanner;

public class VendingMachine
{
    public static void main(String[] args)
    {
        int notes[] = {1, 2, 5, 10, 50, 100, 500, 1000};
        int noteCounter[] = new int[notes.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter amount to calculate minimum number of notes to get return :");
        int amount = scanner.nextInt();
        scanner.close();
        int minNumOfNotes = 0;
        for (int index = notes.length - 1; index >= 0; index--)
        {
            if (amount >= notes[index])
            {
                noteCounter[index] = amount / notes[index];
                amount = amount - noteCounter[index] * notes[index];
            }
        }
        for (int index = notes.length - 1; index >= 0; index--)
        {
            if (noteCounter[index] != 0)
            {
                minNumOfNotes++;
                System.out.println(notes[index] + " : " + noteCounter[index]);
            }
        }
        System.out.println("minimum number of notes required are : " + minNumOfNotes);
    }
}
