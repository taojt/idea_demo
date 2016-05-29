package com.shiyanlou.BookClass;

/**
 * 测试类
 *
 * @author BookClass
 * @create 2016-05-29
 */
public class Test{
    public static void main(String[] args){
        Book book = new Book("Thinking in Java!", "Tom", "2334-32423-213-8");
        System.out.println("The book's name:" + book.getName());
        System.out.println("The book's author: " + book.getAuthor());
        System.out.println("The book's ISBN: " + book.getISBN());
    }
}
