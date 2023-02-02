package com.roxannnna.learning.math;

import java.io.IOException;

public class SumVoid {
    public static void main(String[] args) throws IOException {
        int result = someMethod(4, 7);
        System.out.println("Suma liczb: " + result);


        int result2 = someMethod2(4, 4);
        System.out.println("Suma liczb: " + result2);
    }

    //Tworzenie metod:
    static int someMethod(int x, int y) {

        int z = x + y;
        return z;
    }
    // nie da się przy static void zwrocic z
   // static void someMethod2( int x, int y) {
        //int z = x+y;
       // return z;
   // }
    static int someMethod2( int x, int y) {
        int z = x+y;
         return z;
    }

}
