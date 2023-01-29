package com.roxannnna.learning.ifcondition;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        System.out.println("Type number: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Entered: " + num);

        if (num > 10) {
            System.out.println("Number is higher than 10");
        } else if (num <= 5) {
            System.out.println("Number is lower or equal to 5");
        } else if (num < 8) {
            System.out.println("Number is lower than 8 and higher than 5");
        } else {
            System.out.println("Number is between 5 and 10");
        }


        System.out.println("Finished");
    }
}
