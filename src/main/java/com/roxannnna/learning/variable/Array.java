package com.roxannnna.learning.variable;

public class Array {
    public static void main(String [] args) {
        int[] anArray;
        anArray = new int [5];
        anArray[0] = 7;
        anArray[1] = 90;
        anArray[2] = 189;
        anArray[3] = 556;
        anArray[4] = 994;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);

        //Dodawanie liczb

        int num0 = anArray[0];
        int num1 = anArray[1];
        int num2 = anArray[2];
        int num3 = anArray[3];
        int num4 = anArray[4];

        int total = num0 + num1 + num2 + num3 + num4;

        System.out.println("Result: " + total);
    }
}
