package com.roxannnna.learning.collections;

import java.util.TreeMap;

public class TreeMapMain {
    public static void main(String[] args){
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"Tree");
        treeMap.put(2,"Map");
        treeMap.put(5,"cokolwiek");
        System.out.println(treeMap.get(2));
        System.out.println(treeMap);

    }
}
