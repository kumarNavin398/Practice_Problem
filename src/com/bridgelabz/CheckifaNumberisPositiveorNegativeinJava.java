package com.bridgelabz.basic;
import java.util.*;
class CheckifaNumberisPositiveorNegativeinJava
{
    public static void main (String[]args)
    {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter Your number - ");
        int n = sc.nextInt();

        //Conditions to check if the number is negative or positive
        if (n > 0)
            System.out.println ("The number is positive");
        else if (n < 0)
            System.out.println ("The number is negative");
        else
            System.out.println ("Zero");
    }
}