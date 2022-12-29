package com.bridgelabz.basic;
import java.util.Scanner;
public class PerfectSquareOrNoTiNjAVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        for (int i=1; i<num; i++) {
            if(i*i==num) {
                System.out.println("Given number is square of" + i);
            return;
            }
        }
    }
    
}
