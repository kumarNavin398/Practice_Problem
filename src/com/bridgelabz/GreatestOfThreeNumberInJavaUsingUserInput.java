package com.bridgelabz.basic;

import java.util.Scanner;

public class GreatestOfThreeNumberInJavaUsingUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Number - ");
        int n1 = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter Your Second Number - ");
        int n2 = sc.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter Your Third Number - ");
        int n3 = sc.nextInt();


        //checking if num1 is greatest
        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the greatest");

            //checking if num2 is greatest
        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the greatest");

            //checking if num2 is greatest
        else if (n3 >= n1 && n3 >= n2)
            System.out.println(n3 + " is the greatest");
    }
}
