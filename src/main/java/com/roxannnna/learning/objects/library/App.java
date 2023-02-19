package com.roxannnna.learning.objects.library;

public class App {

    public static void main(String[] args) {
        Library libraryInPałecznica = new Library();
        Author brendaClark = new Author("Brenda", "Clark");
        Book book1 = new Book(brendaClark, "Franklin i przyjaciele", 20, 1);
        Author jKRowling = new Author("JK","Rowling");
        Book book2 = new Book(jKRowling,"HP i Czara Ognia", 740, 30);
        Book book3 = new Book(jKRowling,"HP i Więzień Azkabanu",360,13);
        libraryInPałecznica.addBook(book1);
        libraryInPałecznica.addBook(book2);
        libraryInPałecznica.addBook(book3);
        System.out.println("Liczba książek w bibliotece w Pałczenicy: " + libraryInPałecznica.getNumberOfBooks());
        System.out.println("Ilość HP i Czara Ognia: " + libraryInPałecznica.searchByTitle("HP i Czara Ognia"));
        System.out.println("Ilość książek JK Rowling: " + libraryInPałecznica.searchByAuthor("JK","Rowling"));

        Reader reader1 = new Reader("Roksana", "Skinderowicz", 12345);
        libraryInPałecznica.addReader(reader1);

        libraryInPałecznica.getReaderByName("Roksana");
        System.out.println("Ilość czytelników o imieniu Roksana: " +libraryInPałecznica.getReaderByName("Roksana"));
    }
}
