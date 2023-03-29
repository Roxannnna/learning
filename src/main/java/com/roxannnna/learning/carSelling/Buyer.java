package com.roxannnna.learning.carSelling;

public class Buyer {

    private String name;
    private String surname;
    private int age;

    public Buyer(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String ageVerificaion(int age) {
        if (age < 18) {
           return "You have to be over 18 to make appointment";
        } else
            return "You can make an appointment";
    }
    public String toString() {
        return "Name: " + name + " " + "Surname: " + surname + " " + "Age: " + age;
    }

}


