package com.roxannnna.learning.method;

public class AppStringSum {

    public static void main(String[] args) {
        System.out.println( stringSum("ALA MA", "KOTA"));
        System.out.println( stringSum("ALA MA", "PSA"));
        System.out.println( stringSum("JANEK", "MA","WĘŻA"  ));
        System.out.println( sum(1,2));
    }

    static String stringSum(String A, String B ) {
        String total = A + " " + B + " :)";
        return total;
    }
    static String stringSum(String A, String B, String C ) {
        String total = A + " " + B + " " + C + " :)";
        return total;
    }

    static int sum(int a, int b){
        return a +b;
    }
}
