package com.roxannnna.learning.ifcondition;

import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {
        System.out.println("Type number of the month: ");

        Scanner in = new Scanner(System.in);
        int numberOfMonth = in.nextInt();

        System.out.println("Type number of the day: ");
        int numberOfDay = in.nextInt();

        if (numberOfMonth == 3 && numberOfDay > 20) {
            System.out.println("SPRING");
        }

        if (numberOfMonth == 3 && numberOfDay <= 20 ) {
            System.out.println("WINTER");
        }

        if (numberOfMonth == 1) {
            System.out.println("WINTER");
        }

        if (numberOfMonth == 2) {
            System.out.println("WINTER");
        }

        if (numberOfMonth == 4) {
            System.out.println("SPRING");
        }

        if (numberOfMonth == 5) {
            System.out.println("SPRING");
        }
        if (numberOfMonth == 6 && numberOfDay >= 21) {
            System.out.println("SUMMER");
        }
        if (numberOfMonth == 6 && numberOfDay < 21) {
            System.out.println("SPRING");
        }


        System.out.println("Finished");
    }
}
