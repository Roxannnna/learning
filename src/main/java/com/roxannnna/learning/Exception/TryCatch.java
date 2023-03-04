package com.roxannnna.learning.Exception;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        String[] words = new String[5];

        int i = 0;
        try {
            do {
                words[i] = keybord.next();
            } while (!words[i++].equals("Wyjście"));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Możesz wpisać tylko 5 słów");
        }
        for (int j = 0; j < 5; j++) {
            try {
            System.out.println(words[j].length());
        } catch (NullPointerException e) {
                System.out.println("Mogłeś wpisać maksymalnie 5 słów");
            }
        }
        keybord.close();
    }
}
