package com.roxannnna.learning.objects.library;

public class  Book {

    //atrybuty
    private Author author;

    private String title;

    private int pageNumbers;
    private int chapterNumbers;
//konstruktor
    public Book(Author author, String title, int pgNb, int chaptNb) {
        this.author = author;
        this.title = title;
        this.pageNumbers = pgNb;
        this.chapterNumbers = chaptNb;
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
    @Override
    public String toString() {
        return "Book --" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pageNumbers=" + pageNumbers +
                ", chapterNumbers=" + chapterNumbers;
    }
}
