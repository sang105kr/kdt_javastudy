package com.kh.day12.q8;

import java.util.Arrays;

public class BookCatalogue {
    private Book[] catalogue;  //Book 객체들의 배열
    private int capacity;       // 도서목록의 최대 크기
    private int bookCount;      // 도서목록에 있는 책들의 총수

    public BookCatalogue() {
        capacity = 10;
        catalogue = new Book[capacity];
    }

    //    	addToCatalogue: 도서목록에 한 Book 객체를 추가한다
    public void addToCatalogue(Book book){
        catalogue[bookCount++] = book;
    }

    //    	toString: 도서목록의 상태를 문자열로 반환한다
    @Override
    public String toString() {
        return "BookCatalogue{" +
                "catalogue=" + Arrays.toString(catalogue) +
                ", capacity=" + capacity +
                ", bookCount=" + bookCount +
                '}';
    }

    public Book[] getCatalogue() {
        return catalogue;
    }
}
