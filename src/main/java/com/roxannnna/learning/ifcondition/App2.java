package com.roxannnna.learning.ifcondition;

import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        System.out.println("Type number: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Entered: " + num);

        if (num > 10) {
            System.out.println("Number is higher than 10");
        }

        if (num < 10) {
            System.out.println("Number is lower than 10");
        }

        if (num == 10) {
            System.out.println("Number is equal to 10");
        }

        System.out.println("Finished");
    }
}
