package com.roxannnna.learning.method;

public class AppMethodSeason {

    public static void main(String[] args) {

        System.out.println(isSpring(3, 20));
    }

    static boolean isSpring(int month, int day) {
        if (month < 3) {
            return false;
        }
        if (month >= 7) {
            return false;
        }
        if (month >= 4 && month <= 5) {
            return true;
        }
        if (month == 3 && day > 20) {
            return true;
        }
        if (month == 3 && day <= 20) {
            return false;
        }
        if (month == 6 && day >21) {
            return false;
        }
        if (month == 6 && day <= 21) {
            return true;
        } else {
            return false;
        }
    }
}
