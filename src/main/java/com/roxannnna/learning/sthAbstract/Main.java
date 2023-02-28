package com.roxannnna.learning.sthAbstract;

import java.sql.SQLOutput;

public class Main {
    public static void main (String [] args) {
        Cat Puchacz = new Cat("Puchacz", 2);

        Dog Kraker = new Dog("Kraker",14);

        Puchacz.makeNoise();
        Puchacz.printName();
        System.out.println("Wiek Puchacza: " +Puchacz.age);

        Kraker.makeNoise();
        Kraker.printName();
        System.out.println("Wiek Krakusia: " + Kraker.age);
    }

}
