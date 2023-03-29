package com.roxannnna.learning.sthAbstract;

public class Dog extends Animal implements Swimable,Cloneable{
    Dog (String name, int age){
        super(age, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("How How");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
}
