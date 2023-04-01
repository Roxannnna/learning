package com.roxannnna.learning.frame;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    String surname;
    int age;
    String gender;
    public Person(String name, String surname, int age, String gender){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    public String toString(){
        return name + " " + surname + " " + age + " " + gender;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
}
