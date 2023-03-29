package com.roxannnna.learning.carSelling;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car ("C5","Black","Non-touch", "Yes", "Half-Leather", "No","Yes","Manual","Benzine");
        System.out.println(car1.toString());
        Buyer buyer1 = new Buyer("Roksana","Skinderowicz",22);
        System.out.println(buyer1.ageVerificaion(22));
        System.out.println(buyer1.toString());
        Citroen citroen = new Citroen("C5","black","Non-touch","Yes", "Half-Leather","No","Yes","Manual","Benzine");


    }
}
