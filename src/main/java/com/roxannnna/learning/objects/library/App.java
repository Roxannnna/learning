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
     //   System.out.println("Liczba książek w bibliotece w Pałczenicy: " + libraryInPałecznica.getNumberOfBooks());
    //    System.out.println("Ilość HP i Czara Ognia: " + libraryInPałecznica.searchByTitle("HP i Czara Ognia"));
     //   System.out.println("Ilość książek JK Rowling: " + libraryInPałecznica.searchByAuthor("JK","Rowling"));

        Reader reader1 = new Reader("Roksana", "Skinderowicz");
        libraryInPałecznica.addReader(reader1);

        Reader reader2 = new Reader("Krystian", "Skinderowicz");
        libraryInPałecznica.addReader(reader2);
    //    System.out.println("ID Roksany: " + reader1.getId());
    //    System.out.println("ID Krystiana: " + reader2.getId());

        libraryInPałecznica.getReaderByName("Roksana");
    //    System.out.println("Ilość czytelników o imieniu Roksana: " +libraryInPałecznica.getReaderByName("Roksana"));


        libraryInPałecznica.borrowBook("Franklin i przyjaciele");
       // libraryInPałecznica.printBooks();
        libraryInPałecznica.printAvailableBooks();
        BookDataBase b = new BookDataBase();
        b.addBooks(book1, book2, book3);
    }

}
