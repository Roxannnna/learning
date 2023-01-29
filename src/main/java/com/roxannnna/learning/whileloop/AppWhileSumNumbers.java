package com.roxannnna.learning.whileloop;

import java.util.Scanner;

public class AppWhileSumNumbers {

    public static void main(String[] args) {
        System.out.println("Type number: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int index = 0;

        int sum = 0;

        while (index < num) {

            sum = index + sum;

            System.out.println(sum);

            index = index +1;
        }

    }
}
