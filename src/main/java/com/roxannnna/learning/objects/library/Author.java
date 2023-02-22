package com.roxannnna.learning.objects.library;

public class Author {
//atrybuty
    private String name;
    private String surname;
//konstruktor
    public Author(String name, String surname) {
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

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
