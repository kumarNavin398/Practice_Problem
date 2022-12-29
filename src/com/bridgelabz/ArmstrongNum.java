package com.bridgelabz.basic;
import java.util.Scanner;
class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number - ");
        int num = sc.nextInt();
        int temp, result = 0;
        temp = num;
        while (num > 0) {
            int mod = num % 10;
            result = result + mod * mod * mod;
            num = num / 10;
        }
        if (temp == result)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}