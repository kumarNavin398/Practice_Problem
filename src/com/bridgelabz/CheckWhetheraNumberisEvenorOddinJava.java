package com.bridgelabz.basic;

import java.util.Scanner;

public class CheckWhetheraNumberisEvenorOddinJava {
    public static void main (String[]args)
    {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter Your number - ");
        int n = sc.nextInt();

        //Conditions to check if the number is negative or positive
        if (n % 2 == 0)
            System.out.println (n   + "--The Give Input Is Even");
        else
            System.out.println (n  + "--The Given Input Is Odd");
    }
}
