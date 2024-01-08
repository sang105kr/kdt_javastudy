package com.kh.day12.q8;

public class Book {
    private String bookName;    //도서명
    private String bookAuthor;  //저자
    private int bookPrice;      //가격

    public Book(String bookName, String bookAuthor, int bookPrice) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
