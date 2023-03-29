package com.roxannnna.learning.sthAbstract;

public class Cat extends Animal{
    Cat (String name, int age){
        super(age, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow Meow");
    }
}
