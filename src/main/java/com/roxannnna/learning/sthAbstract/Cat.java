package com.roxannnna.learning.sthAbstract;

public class Cat extends Animal{
    Cat (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow Meow");
    }
}
