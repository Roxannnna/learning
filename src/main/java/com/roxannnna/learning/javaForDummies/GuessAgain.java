package com.roxannnna.learning.javaForDummies;

import java.util.Random;
import java.util.Scanner;

public class GuessAgain {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);

        int numGuesses = 0;
        int randomNumber = new Random().nextInt(100) + 1;

        System.out.println("Witaj w grze zgadywania liczb!");

        System.out.println("Wpisz liczbę całkowitą od 1 do 100.");

        int inputNumber = keybord.nextInt();
        numGuesses++;

        while (inputNumber != randomNumber) {
            System.out.println("Niestety nie udało Ci się odgadnąć. Spróbuj ponownie");
            System.out.println("Wpisz liczbę całkowitą od 1 do 100.");
            inputNumber = keybord.nextInt();
            numGuesses++;
            if (inputNumber > randomNumber){
                System.out.println("Twoja liczba jest większa niż liczba wylosowana przez program");
            }
            if (inputNumber < randomNumber){
                System.out.println("Twoja liczba jest mniejsza niż liczba wylosowana przez program");
            }

        }
        System.out.println("Brawo!");
        System.out.println("Wygrywasz po " + numGuesses + " próbach");
        keybord.close();
    }
}
