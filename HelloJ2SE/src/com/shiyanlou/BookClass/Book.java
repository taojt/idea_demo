package com.shiyanlou.BookClass;

/**
 * 图书类
 *
 * @author BookClass
 * @create 2016-05-29
 */
public class Book {
    private String name;
    private String author;
    private String ISBN;

    public Book(String name, String author, String ISBN) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.ISBN;
    }

}
