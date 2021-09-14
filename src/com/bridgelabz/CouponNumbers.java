package com.bridgelabz;

import java.util.Scanner;

public class CouponNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many distinct coupons needed?");
        int numOfCoupons = scanner.nextInt();
        scanner.close();
        distinctCoupons(numOfCoupons);

    }
    private static void distinctCoupons(int numOfCoupons)
    {
        int numOfRandomNumbers =0;
        int coupons[] = new int[numOfCoupons];
        int count=0;
        while(count < numOfCoupons)
        {
            boolean flag =true;
            int randomNum = (int)Math.floor(Math.random()*100);
            numOfRandomNumbers++;
            for(int index=0;index<coupons.length;index++)
            {
                if(coupons[index]==randomNum)
                {
                    flag=false;
                }
            }
            if(flag == true)
            {
                coupons[count++] = randomNum;
            }
        }
        for (int element:coupons)
        {
            System.out.println("Distinct coupons are: "+element);
        }
        System.out.println("Number of attempts: "+numOfRandomNumbers);
    }
}
