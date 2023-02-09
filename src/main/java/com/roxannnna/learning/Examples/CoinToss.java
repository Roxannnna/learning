package com.roxannnna.learning.Examples;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class CoinToss {
    public static void main(String[] args) {

            String o;
            String orzel = o;
            String r;
            String reszka = r;
            boolean guessed = false;

            System.out.println("Program rzuca monetą: ");
            String randomChoice = getRandomCoinHeadOrTail(orzel, reszka);

            System.out.println("Zgadnij co wylosował program orzeł (o) czy reszka (r)?: ");

            while (guessed == false) {
                String userChar = getRandomChoiceFromUser();
                if (userChar == randomChoice) {
                    System.out.println("Brawo, zgadleś!");
                    guessed = true;
                } else {
                    System.out.println("Twój wybór jest nieprawidłowy!");

                }

                static String getRandomChoiceFromUser() {
                    System.out.println("Podaj znak orzeł (o) lub reszka (r): ");
                    Scanner in = new Scanner(System.in);
                    String enteredChar = String.valueOf(in.nextInt());
                }

    }

    //To metoda losujaca orla ("O") lub reszke ("R").
    static String getRandomCoinHeadOrTail() {
        int randomNum = ThreadLocalRandom.current().nextInt(1,10) % 2;
        if (randomNum == 0) {
            return "R";
        } else {
            return "O";
        }
    }
}
}
