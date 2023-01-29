package com.roxannnna.learning.math;

import java.util.Scanner;

public class StringSum {

    public static void main(String[] args) {
        System.out.println("Type string 1: ");

        Scanner in = new Scanner(System.in);
        String string1 = in.nextLine();

        System.out.println("Type string 2: ");
        String string2 = in.nextLine();

        String string3 = string1 + string2;
        System.out.println(string3);

        System.out.println("Finished");
    }
}
