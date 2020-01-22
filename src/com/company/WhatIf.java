package com.company;

import java.util.Scanner;

public class WhatIf {

    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("First number: ");
        num1 = scan.nextInt();
        System.out.println("Second number: ");
        num2 = scan.nextInt();

        sum(num1, num2);
        int product = (num1 * num2);
        System.out.println("Product = " + product);
        double avg = (num1 + num2) / 2;
        System.out.println("Average = " + avg);
    }

    public static void sum(int num1, int num2) {//if/else method for symbol next to sum
        int sum = num1 + num2;

        if (sum > 1000) {
            System.out.println("Sum = ~" + sum);
        } else if (sum > 200) {
            System.out.println("Sum = *" + sum);
        } else {
            System.out.println("Sum = " + sum);
        }
    }
}
