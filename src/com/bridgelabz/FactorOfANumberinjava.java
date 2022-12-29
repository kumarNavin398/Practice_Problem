package com.bridgelabz.basic;
import java.util.Scanner;
public class FactorOfANumberinjava {
    public static void main(String[] args){

            int N, X;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your number --");
            N = sc.nextInt();
            Scanner sc2 = new Scanner(System.in);    //System.in is a standard input stream
            System.out.print("Enter Your Second Number - ");
            X = sc2.nextInt();
            if(N % X == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

