package com.roxannnna.learning.objects.library;

public class Reader extends Person{
    private static int idGenerator = 100000;

    private int id;
    //konstruktor
    public Reader(String name, String surname) {
        super(name, surname);
        this.id = idGenerator;
        idGenerator ++;
    }
    //metody zwracające dane z atrybutów konstruktora
    public int getId() { return id; }

}

