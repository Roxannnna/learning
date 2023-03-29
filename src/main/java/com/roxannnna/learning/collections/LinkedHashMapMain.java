package com.roxannnna.learning.collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashMapMain {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"Ore Ore");
        linkedHashMap.put(2, "Siaba");
        linkedHashMap.put(4,"Da Amore");
        linkedHashMap.put(3,"Daba");
        System.out.println(linkedHashMap);
    }
}
