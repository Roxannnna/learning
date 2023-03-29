package com.roxannnna.learning.enumeratedTypes;

public enum Tea {
    raspberry_tea(2),
    green_tea(1),
    rooibos_tea(3),
    yerba_mate(4),
    english_breakfast(5);
   final int myFavouriteTea;
    Tea (int myFavouriteTea) {
        this.myFavouriteTea = myFavouriteTea;


    }
}
