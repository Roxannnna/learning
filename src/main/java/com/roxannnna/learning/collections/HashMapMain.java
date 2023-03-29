package com.roxannnna.learning.collections;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args){
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Harry Potter");
        hashMap.put(2,"Hermiona Granger");
        hashMap.put(3,"Ron Weasley");
        System.out.println(hashMap);
    }
}
