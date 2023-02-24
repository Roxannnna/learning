package com.roxannnna.learning.objects.library;

public class Author extends Person {

//konstruktor
    public Author(String name, String surname) {
     super(name, surname);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
