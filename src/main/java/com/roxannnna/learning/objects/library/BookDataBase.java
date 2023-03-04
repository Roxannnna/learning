package com.roxannnna.learning.objects.library;

import java.util.HashMap;
import java.util.Map;

public class BookDataBase {
    private Map<String,Book> booksMap;
   public BookDataBase() {
       booksMap  = new HashMap<>();
   }
   public void addBook(Book book) {
       booksMap.put(book.getTitle(), book);
   }
   public void addBooks(Book... books){
       for (Book b : books){
           addBook(b);
       }
   }
   public int getNumOfBooks(){
      return booksMap.size();
   }
}
