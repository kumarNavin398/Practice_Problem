package com.bridgelabz.basic;
import java.util.Scanner;
public class PowerCalculationInJavaUsingUserInput {
    public static void main(String[] args){
        int n,p,result=1;
        System.out.println("Enter Your Number");
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
        System.out.println("Enter Your Number");

        p=r.nextInt();
        for(int i=1; i<=p; i++)
        {
            result = n*result;
        }
        System.out.println("Your result is" + result);
    }
}
