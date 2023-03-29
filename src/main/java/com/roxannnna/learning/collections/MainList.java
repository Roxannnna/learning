package com.roxannnna.learning.collections;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        l.add("Puchacz");
        l.add("Kraker");
        l.add("Puchacz");
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.contains("Dropsik"));
        System.out.println(l.isEmpty());
        System.out.println(l.get(1));
        l.set(2,"Dropsik");
        System.out.println(l);
    }
}
