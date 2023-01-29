package com.roxannnna.learning.method;

public class MinMaxNumber {

    public static void main(String[] args) {
       // System.out.println("Max Number: " + maxNumber(9, 2, 13));
     //   System.out.println("Max Number: " + maxNumber(5, 10, 15));

       // int m = maxNumber(2, 17, 15);
       // System.out.println("Max: " + m);

        System.out.println("Min: " + minNumber(1,5,9));
        System.out.println("Min: " + minNumber(8,7,1));
        System.out.println("Min: " + minNumber(5,1,7));


    }

    static int minNumber(int X, int Y, int Z) {
        int min = 3;
        if (X < Y && X < Z) {
            min = X;
        } else if ( Y < X && Y < Z) {
            min = Y;
        }
        else {
            min = Z;
        }

        return min;
    }

    static int maxNumber(int X, int Y, int Z) {
        if (X > Y && X > Z) {
            return X;
        }
        if ( Y > X && Y > Z) {
            return Y;
        }
        else {
            return Z;
        }
    }
}
