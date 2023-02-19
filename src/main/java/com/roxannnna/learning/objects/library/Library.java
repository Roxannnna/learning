package com.roxannnna.learning.objects.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        books = new ArrayList<Book>();
        readers = new ArrayList<Reader>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public int getNumberOfBooks() {
        int size = books.size();
        return size;
    }

    public int searchByTitle(String title) {
        int n = 0;
        for (Book b : books) {
            if (title.equals(b.getTitle())) {
                n++;
            }
        }
        return n;
    }

    public int searchByAuthor(String name, String surname) {
        int n = 0;
        for (Book b : books) {
            if (b.getAuthor().getName().equals(name) && (b.getAuthor().getSurname().equals(surname))) {
                n++;
            }
        }
        return n;
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public int getReader() {
        int size = readers.size();
        return size;

    }

    public int getReaderByName(String name) {
        int n = 0;
        for (Reader reader : readers) {
            if (name.equals(reader.getName())) {
                n++;
            }
        }
        return n;
    }
}