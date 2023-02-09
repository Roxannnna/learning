package com.roxannnna.learning.objects.library;

public class App {

    public static void main(String[] args) {

        Author brendaClark = new Author("Brenda", "Clark");
        

        Book book1 = new Book(brendaClark, "Franklin i przyjaciele", 20, 1);
        book1.setTitle("Franking i nieprzyjaciele");
        System.out.println(book1.toString());
        System.out.println(book1.getAuthor().getName());

    }
}
