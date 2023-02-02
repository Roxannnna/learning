package com.roxannnna.learning.variable;

import java.util.Arrays;

public class ArrayCopy {
//    public static void main(String[] args) {
//        //    tablica o nazwie copy from
//        String[] copyFrom = {
//                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
//                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
//                "Marocchino", "Ristretto"};
//        String[] copyTo = new String[7];
//        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
//        for (String coffee : copyTo) {
//            System.out.println(coffee + " ");
//        }
//    }
    public static void main(String[] args) {
        String[] m = new String[5];
        m[0] = "A";
        m[1] = "Ja";
        m[2] = "Bardzo";
        m[3] = "Lubię";
        m[4] = "Placki";
        String z = m[0] + m[1] + m[2] + m[3] + m[4];
        System.out.println("MojeZdanie: " + z);
        String[] copyTo2 = new String[3];
        System.arraycopy(m, 2, copyTo2, 0, 3);
        for (String tekst : copyTo2) {
            System.out.print(tekst + " ");
        }
    }
}
