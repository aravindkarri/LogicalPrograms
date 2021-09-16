package com.bridgelabz;

import java.util.Scanner;

public class ConversionToBinary
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to convert to binary :: ");
        int number = scanner.nextInt();
        scanner.close();
        String binaryString = String.valueOf(toBinary(number));
        System.out.println("Binary conversion is :: "+binaryString);
        System.out.println("Addition: " +paddedString(number));
    }

    public static String toBinary(int number)
    {
        if(number == 1)
        {
            return String.valueOf(number);
        }
        int remainder = number % 2;
        return toBinary(number / 2) + String.valueOf(remainder);
    }

    public static String paddedString(int number)
    {
        int i = 2;
        String returnString = "";
        String plusCharacter = "";
        while(number > 0)
        {
            if ((number / i) == 0)
            {
                if(returnString.length() != 0)
                {
                    plusCharacter = " + ";
                }
                returnString = returnString + plusCharacter + (i/2);
                number -= (i/2);
                i = 2;
            }
            else if(number == 1)
            {
                return returnString + " + 1";
            } else
            {
                i *= 2;
            }
        }
        return returnString;
    }
}
