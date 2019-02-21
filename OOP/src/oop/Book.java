/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;

/**
 *
 * @author hung.tran
 */
public class Book implements Comparable<Book> {
    private String bookTitle;
    private ArrayList<String> bookAuthor;

    public Book(String title, ArrayList<String> authors) {
        if(title == null && authors == null) {
            throw new IllegalArgumentException("Can't be null");
        }
        if(title.isEmpty() && authors.isEmpty()) {
            throw new IllegalArgumentException("Can't be empty");
        }
        bookTitle = title;
        bookAuthor = authors;
    }

    public String getTitle() {
        return bookTitle;
    }
    public ArrayList<String> getAuthors( ) {
        return bookAuthor;
    }

    public String toString( ) {
        return bookTitle + bookAuthor;
    }
    public int compareTo(Book other){
        return bookTitle.compareTo(other.bookTitle);
    }
    public boolean equals(Object o) {
         if(!(o instanceof Book)) {
             return false;
        }
         Book b = (Book) o;
         return b.bookTitle.equals(bookTitle)
                 && b.bookAuthor.equals(bookAuthor);
    }
    public static void main(String[] args) {
        ArrayList<String> a = null;
        Book b = new Book("Hung", a);
        System.out.println(""+b.toString());
    }
}
