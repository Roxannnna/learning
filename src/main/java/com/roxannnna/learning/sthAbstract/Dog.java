package com.roxannnna.learning.sthAbstract;

public class Dog extends Animal{
    Dog (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("How How");
    }
}
