package com.roxannnna.learning.method;

public class SomeMethod {
    public static void main(String[] args) {
        int y = 4;
        System.out.println(y);
        zmień(y);
        System.out.println(zmień(y));

    }

    public static int zmień(int x) {
        x += 5;
        return x;
    }
}
