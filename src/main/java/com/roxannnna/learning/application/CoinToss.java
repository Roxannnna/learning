package com.roxannnna.learning.application;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CoinToss {

    public static void main(String[] args) {

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
