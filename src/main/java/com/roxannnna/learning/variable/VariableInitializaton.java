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

        //Tablice mozna od razu zainicjalizowac, a potem wpisac dane.
        String[] l = new String[3];
        l[0] = "ALA";
        l[1] = "MA";
        l[2] = "KOTA";

        //Mozna tez w inny sposob zainicjalizowac tablice:
        // m[0] jest rowne 1;
        // m[1] jest rowne 7;
        // m[2] jest rowne 9;
        long[] m = {1, 7, 9};
    }
}
