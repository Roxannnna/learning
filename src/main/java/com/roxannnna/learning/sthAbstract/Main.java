package com.roxannnna.learning.sthAbstract;

import java.sql.SQLOutput;

public class Main {
    public static void main (String [] args) {
        Cat puchacz = new Cat("puchacz", 2);

        Dog kraker = new Dog("kraker",14);

        puchacz.makeNoise();
        puchacz.printName();
        System.out.println("Wiek Puchacza: " +puchacz.age);

        kraker.makeNoise();
        kraker.printName();
        System.out.println("Wiek Krakusia: " + kraker.age);
        display(kraker);
        swim(kraker);
    }
    public static void display(Animal animal){
        animal.printName();
    }
    public static void swim(Swimable swimable){
        swimable.swim();
    }

}
