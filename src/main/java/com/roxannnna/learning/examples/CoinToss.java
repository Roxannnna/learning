package com.roxannnna.learning.examples;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class CoinToss {
    public static void main(String[] args) {


        String orzel = "O";
        String reszka = "R";
        boolean guessed = false;

        System.out.println("Program rzuca monetą: ");
        String randomChoice = getRandomCoinHeadOrTail();

        System.out.println("Zgadnij co wylosował program orzeł (O) czy reszka (R)?: ");

        while (guessed == false) {
            String userChar = getRandomChoiceFromUser();
            if (userChar.equals(randomChoice)) {
                System.out.println("Brawo, zgadleś!");
                guessed = true;
            } else {
                System.out.println("Twój wybór jest nieprawidłowy!");

            }
        }
    }

    static String getRandomChoiceFromUser() {
        System.out.println("Podaj znak orzeł (O) lub reszka (R): ");
        Scanner in = new Scanner(System.in);
        String enteredChar = String.valueOf(in.next());
        return enteredChar;
    }

    //To metoda losujaca orla ("O") lub reszke ("R").
    static String getRandomCoinHeadOrTail() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 10) % 2;
        if (randomNum == 0) {
            return "R";
        } else {
            return "O";
        }
    }
}