package com.roxannnna.learning.objects.library;

public class Reader {
    //atrybuty
    private String name;
    private String surname;
    private int id;
    //konstruktor
    public Reader(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    //metody zwracające dane z atrybutów konstruktora
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public int getId() { return id; }

}

