package com.bridgelabz.basic;
import java.util.Scanner;
public class AutomorphicInJava {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,c=0,sq;
        System.out.println("Enter your number");
        n=sc.nextInt();
        sq=n*n;
        int temp=n;
        while (temp > 0) {
           // d=temp%10;
            c++;
            temp=temp/10;
        }
        int last=(int)(sq%(Math.pow(10,c)));
        if(n==last)
            System.out.println("Automorphic number");
        else
            System.out.println("The number is not Automorphic number");
    }
}
