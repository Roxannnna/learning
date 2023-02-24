package com.roxannnna.learning.objects.library;

public class Person {
    //atrybuty
    protected String name;
    protected String surname;
    //konstruktor
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    //metody
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
