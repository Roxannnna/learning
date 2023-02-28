package com.roxannnna.learning.EnumeratedTypes;

public class Enum {
    public static void main (String [] args){
        DaysOfTheWeek day = DaysOfTheWeek.saturday;
        if (day == DaysOfTheWeek.saturday) {
            System.out.println("Unfortunately it is end of the week");
        }
        DaysOfTheWeek.values();
        //System.out.println(DaysOfTheWeek.values());

        for (DaysOfTheWeek daysx : DaysOfTheWeek.values()) {
            System.out.println(daysx);
        }
        System.out.println(Tea.green_tea.myFavouriteTea);
    }
}
