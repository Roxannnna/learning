package com.roxannnna.learning.whileloop;

import java.util.Scanner;

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
public class AppWhileEvenNumbers {

    public static void main(String[] args) {
        System.out.println("Type number: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int index = 0;

        while (index <= num) {
            int result = index % 2;
            boolean isOddNumber = (result == 1);

            if (isOddNumber) {
                System.out.println(index);
            }

            index = index +1;
        }


    }
}
