package com.roxannnna.learning.Examples;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class GuessNumber {
    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 100;
        int num = 1;
        boolean guessed = false;

        System.out.println("Zagrajmy w gre - program wylosuje liczbe z zakresu od: " + minNumber + " do " + maxNumber);
        int randomNumber = getRandomNumberInRange(minNumber, maxNumber);

        System.out.println("Zgadnij jaka liczba zostala wylosowana!");

        while (guessed == false) {
            int userNumber = getNumberFromUser();
            if (userNumber == randomNumber) {
                System.out.println("Brawo, zgadlas!");
                guessed = true;
            }
            if (userNumber < randomNumber) {
                System.out.println("Liczba " + userNumber + " jest za niska!");
            }
            if (userNumber > randomNumber) {
                System.out.println("Liczba " + userNumber + " jest za wysoka!");
            }
            System.out.println("Liczba powtórzeń: " + num++);
        }
        System.out.println("Koniec programu");
    }

    static int getRandomNumberInRange(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }

    static int getNumberFromUser() {
        System.out.println("Podaj liczbę: ");
        Scanner in = new Scanner(System.in);
        int enteredNumber = in.nextInt();
        return enteredNumber;
    }
}