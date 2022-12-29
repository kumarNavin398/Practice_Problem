package com.bridgelabz.basic;
import java.util.*;
public class FactorsFindingInJava {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number --");
        n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.println(i+".");
            }
        }
    }
}
