package com.roxannnna.learning.variable;

public class Literal {

    public static void main(String[] args) {

        long l = 1;
        int i  = 2;

        //Kompilator wie, ze l to long, bo w lini 7 go zadeklarowalismy,
        //dlatego uzyje metody, ktora przyjmuje long
        methodPrints(l);

        //Kompilator wie, ze i to long, bo w lini 8 go zadeklarowalismy,
        //dlatego uzyje metody, ktora przyjmuje int
        methodPrints(i);

        //Tutaj do metody wkladamy liczbe (nie zmienna),
        //kompilator domyslnie uznaje, ze to int
        methodPrints(12);

        //Aby zmusic kompilator by te liczbe traktowal jako long, dajemy na koncu L.
        methodPrints(12L);
    }

    /*
     * void oznacza, ze metoda nic nie zwraca (dlatego niema return).
     *
     * Mamy dwie metody, ktore cos wypisuja. Jedna jako parametr wejsciowy przyjmuje int,
     * druga long.
     */

    static void methodPrints(int x) {
        System.out.println("This method prints integer: " + x);
    }

    static void methodPrints(long x) {
        System.out.println("This method prints long: " + x);
    }
}
