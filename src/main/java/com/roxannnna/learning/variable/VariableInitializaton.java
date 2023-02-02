package com.roxannnna.learning.variable;

public class VariableInitializaton {

    public static void main(String[] args) {

        //Zmienna i jest zadeklarowana, czyli powiedzielismy, ze bedzie taka zmienna.
        //Nie przypisalismy jednak jej wartosci.
        int i;

        //Dopiero teraz przypisalismy jej wartosc.
        i = 0;

        //Tutaj zmienna jest zadeklarowana i zainicjalizowana (przypisalismy wartosc 2)
        int j = 2;

        //Z tablicami jest podobnie - to jest deklaracja, na razie nie ma wartosci przypisanych.
        int[] k;
        //tutaj dopiero tablica jest stworzona - ma 2 elementy, na razie puste.
        k = new int[2];
        //tu wpisalismy wartosci
        k[0] = 3;
        k[1] = 5;
        int r = k[0] + k[1];
        int result = r;

        System.out.println("Sum:" + result);

        //Tablice mozna od razu zainicjalizowac, a potem wpisac dane.
        String[] l = new String[3];
        l[0] = "ALA";
        l[1] = "MA";
        l[2] = "KOTA";
        String z = l[0] + l[1] + l[2];
        System.out.println("Sentence without space: " + z);
        System.out.println("Sentence with space: " + l[0] + " " + l[1]  + " " + l[2] + " ");

        //Mozna tez w inny sposob zainicjalizowac tablice:
        long[] m = {1, 7, 9};
        m[0] = 1;
        m[1] = 7;
        m[2] = 9;
        long c = m[0] + m[1] + m[2];
        long result2 = c;
        System.out.println("Sum long: " + result2);

    }
}
