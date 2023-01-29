package com.roxannnna.learning.method;

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
public class AppBooleanMethod {

    public static void main(String[] args) {

        if (isNumberGreaterThan10(5)) {
            System.out.println("Number is higher than 10");
        }

        if (isNumberGreaterThan10(8)) {
            System.out.println("Number is higher than 10");
        }

        if (isNumberGreaterThan10(13)) {
            System.out.println("Number is higher than 10");
        }


        System.out.println("Finished");
    }

    static boolean isNumberGreaterThan10(int x) {
        boolean isGreater = x > 10;

        return isGreater;
    }
}
