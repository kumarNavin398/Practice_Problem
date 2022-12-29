package com.bridgelabz.basic;
import java.util.Scanner;
public class StrongNumberUsingJava {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = ob.nextInt();
        int sum = 0;
        int num = n;
        int d;
        while(n>0) {
            int f = 1;
            d = n % 10;
            for (int i = 1; i <= d; i++) {
                f = f * i;
            }
            sum = sum + f;
            n = n / 10;
        }
        if (num == sum)
        {
            System.out.println("It is a Strong Number");
        }
        else
            System.out.println("Not a Strong Number");
    }
}
