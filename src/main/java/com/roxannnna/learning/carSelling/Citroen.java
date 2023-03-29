package com.roxannnna.learning.carSelling;

public class Citroen extends Car{
    public Citroen(String model, String color, String radio, String AC, String seats, String warmSeats, String centralLock, String gearBox, String fuel) {
        super(model, color, radio, AC, seats, warmSeats, centralLock, gearBox, fuel);
    }
    String[] models = {"C5","C5 Aircross", "C4 Cactus"};

    public static void showModels(String[] models){
        for (String m: models)
            System.out.println(m);
    }
}
