package com.roxannnna.learning.math;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        System.out.println("Type number 1: ");

        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();

        System.out.println("Type number 2: ");
        int number2 = in.nextInt();

        int total = number1 + number2;

        System.out.println("Result: " + total);


        System.out.println("Finished");
    }
}
