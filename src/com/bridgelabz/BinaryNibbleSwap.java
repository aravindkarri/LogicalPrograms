package com.bridgelabz;

import java.util.Scanner;

public class BinaryNibbleSwap
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to convert into binary: ");

        ConversionToBinary conversionToBinary = new ConversionToBinary();

        String binaryString = ConversionToBinary.toBinary(scanner.nextInt());
        System.out.println("Binary representation of the number: " + binaryString);

        //stores swapped binary nibbles
        int SwappedBinary = swapNibbles(binaryString);
        System.out.println("Binary after swapping: " + SwappedBinary);

        //stores new integer
        int swappedBinaryInteger = binaryToInteger(SwappedBinary);
        System.out.println("Number after swapping nibbles: " + swappedBinaryInteger);;

        //checks if number is power of two and prints
        if(isPowerOfTwo(SwappedBinary))
        {
            System.out.println("The number is power of two");
        }
        else
        {
            System.out.println("The number is not power of two");
        }
        scanner.close();

    }

    public static int swapNibbles(String binaryString)
    {
        int size = binaryString.length();
        for(int i = 0; i < 8 - size; i++)
        {
            binaryString = "0" + binaryString;
        }
        String nibble1 = binaryString.substring(0, 4);
        String nibble2 = binaryString.substring(4);
        return Integer.parseInt(nibble2 + nibble1);
    }

    public static int binaryToInteger(int binary)
    {
        String binaryString = String.valueOf(binary);
        int number = 0;
        for (int index = 0; index < binaryString.length(); index++)
        {
            int tempDigit = binaryString.charAt(index) - '0';
            number = number * 2 + tempDigit;
        }
        return number;
    }

    public static boolean isPowerOfTwo(int binary)
    {
        String binaryString = String.valueOf(binary);

        for (int index = 1; index < binaryString.length(); index++)
        {
            if(binaryString.charAt(index) != '0')
            {
                return false;
            }
        }
        return true;
    }
}
