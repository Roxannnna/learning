package com.roxannnna.learning.sthAbstract;

public abstract class Animal {
    int age;
    String name;
    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }
    public abstract void makeNoise();
    public void printName() {
        System.out.println("My name is: " + name);
    }

}
