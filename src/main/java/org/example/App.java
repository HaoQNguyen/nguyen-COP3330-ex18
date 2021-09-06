/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        System.out.print("Your Choice: ");
        String start = input.nextLine();

        if (start.equalsIgnoreCase("c"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double F = input.nextDouble();
            double C = (F - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is %.2f.", C);
        }
        else
        {
            System.out.print("Please enter the temperature in Celsius: ");
            double C = input.nextDouble();
            double F = C * 9 / 5 + 32;
            System.out.printf("The temperature in Fahrenheit is %.2f.", F);
        }
    }
}
