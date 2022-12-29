package com.bridgelabz.basic;

import java.util.Scanner;


    public class SumOfTheNumbersUsingUserInputInJava {
        public static void main (String[]args)
        {
            Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
            System.out.print("Enter Your First Number - ");
            int n1 = sc.nextInt();
            Scanner sc2= new Scanner(System.in);    //System.in is a standard input stream
            System.out.print("Enter Your Second Number - ");
            int n2 = sc2.nextInt();
            int sum = 0;

            for (int i = n1; i <= n2; i++)
                sum = sum + i;
            System.out.println ("The sum is " + sum);
        }
    }


