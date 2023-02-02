package com.roxannnna.learning.variable;

public class ArrayOfArrays {
    public static void main(String[] args) {
        String [][] names = {
                {"Pan ", "Pani "},
                {"Roksana", "Krystian"}
        };
        //coś tutaj jest nie tak, pomocy --> chciałam napisać Pani Roksana, Pan Krystian
        System.out.println(names[0][1] + names[1][0]);
        System.out.println(names[1][0] + names[0][1]);
        System.out.println(names.length);

    }
}
