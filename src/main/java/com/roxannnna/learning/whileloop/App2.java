package com.roxannnna.learning.whileloop;

import java.util.Scanner;

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
public class App2 {

    public static void main(String[] args) {
        System.out.println("Type number: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();


        while (num >= 0) {
            System.out.println(num);
            num = num -1;
        }


    }
}
