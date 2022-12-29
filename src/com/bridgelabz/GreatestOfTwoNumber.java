package com.bridgelabz.basic;

import java.util.Scanner;

public class GreatestOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter Your First Number - ");
        int n1 = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter Your Second Number - ");
        int n2 = sc.nextInt();
        if (n1 == n2)
            System.out.println("both are equal");
        else if (n1 > n2)
            System.out.println(n1 + " is greater");

        else
            System.out.println(n2 + " is greater");

    }
}




