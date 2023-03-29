package com.roxannnna.learning.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetMain {
    public static void main(String[] args){
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("Chicago");
        hashSet.add("Paryż");
        hashSet.add("Krym");
        System.out.println(hashSet);
    }
}
