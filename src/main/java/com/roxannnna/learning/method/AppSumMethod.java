package com.roxannnna.learning.method;

//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
public class AppSumMethod {

    public static void main(String[] args) {
        System.out.println( sum(1, 3) );
        System.out.println( sum(2, 4) );
        System.out.println( sum(2, -4) );
    }

    static int sum(int x1, int x2) {
       int total = x1 + x2;
       return total;
    }
}
