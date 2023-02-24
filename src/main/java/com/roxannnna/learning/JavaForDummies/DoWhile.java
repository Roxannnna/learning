package com.roxannnna.learning.JavaForDummies;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Wpisz liczbę całkowitą od 1 do 10: ");
        Scanner keybord = new Scanner(System.in);
        int inputNbr = keybord.nextInt();
        int numGuesses = 0;
        numGuesses++;
        int minNumber = 1;
        int maxNumber = 10;
        int randomNum = getRandomNumberInRange(minNumber, maxNumber);
        do
    {
        System.out.println("Spróbuj ponownie...");
        System.out.println("Wpisz liczbę całkowitą od 1 do 10");
        inputNbr = keybord.nextInt();
        numGuesses++;
    } while(inputNbr != randomNum);
        System.out.println("Wygrywasz po: " + numGuesses + "próbach");
}
    static int getRandomNumberInRange(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }
}
