package com.roxannnna.learning.objects.library;

public class  Book {

    //atrybuty
    private Author author;

    private String title;

    private int pageNumbers;
    private int chapterNumbers;
    private BooksState state;
//konstruktor
    public Book(Author author, String title, int pgNb, int chaptNb) {
        this.author = author;
        this.title = title;
        this.pageNumbers = pgNb;
        this.chapterNumbers = chaptNb;
        this.state = BooksState.AVAILABLE;
    }
//metody
    public Author getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public BooksState getState() {
        return state;
    }
    public void borrow() {
        state = BooksState.BORROWED;
    }
    public void unborrow() {
        state = BooksState.AVAILABLE;
    }

    public String toString() {
        return "Book --" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pageNumbers=" + pageNumbers +
                ", chapterNumbers=" + chapterNumbers +
                ", State = " + state;
    }
}
