package com.bridgelabz.basic;
import java.util.Scanner;

public class PallindromeInJavaUsingUserInput {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int ans = 0, r;
        int temp = num;
        while(num>0)
        {
            r = num % 10;
            ans = (ans*10)+r;
            num = num/10;
        }
        if(temp==ans)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Not a palindrome");
    }
}
