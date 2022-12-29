package com.bridgelabz.basic;

import java.util.Scanner;
public class SumOfNnturalsNumbersinJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter Your number - ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.println(sum);

    }
}

