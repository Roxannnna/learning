package com.roxannnna.learning.CarSelling;

import java.util.ArrayList;
import java.util.List;

public class Car {
    String model;
   String color;
   String radio;
   String AC;
   String seats;
   String warmSeats;
   String centralLock;
   String gearBox;
   String fuel;

   public Car(String model,String color, String radio, String AC,
              String seats, String warmSeats, String centralLock,
              String gearBox, String fuel) {
       this.model = model;
       this.color = color;
       this.radio = radio;
       this.AC = AC;
       this.seats = seats;
       this.warmSeats = warmSeats;
       this.centralLock = centralLock;
       this.gearBox = gearBox;
       this.fuel = fuel;
   }
       public String toString() {
           return "Model: " + model +
                   ", Color: " + color +
                   ", Radio: " + radio +
                   ", AC: " + AC +
                   ", Seats: " + seats +
                   ", Warm Seats: " + warmSeats +
                   ", Central Lock: " + centralLock +
                   ", Gear Box: " + gearBox +
                   ", Fuel: " + fuel;
       }
   }