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

    //  도서 추가
    public void addToCatalogue(String bookName, String author, int price){
        // 비어 있는 인덱스 찾기
        int idx = findNullIdx();
        if (idx == -1) {
            System.out.println("10권이 모두 찼습니다.");
        }else{
            catalogue[idx] = new Book(bookName,author,price);
            System.out.println(catalogue[idx].getBookName() + " 도서가 추가되었습니다.");
        }
    }

    // 도서 제거
    public void deleteBook(String bookName) {
        int idx = searchBookIdx(bookName);
        if(idx == -1){
            System.out.println("찾고자 하는 도서가 없습니다.");
            return;
        }
        catalogue[idx] = null;
        System.out.println(bookName + " 도서가 제거되었습니다.");
    }

    // 도서 가격 수정
    public void chagneBookPrice(String bookName, int price) {
        int idx = searchBookIdx(bookName);
        if(idx == -1){
            System.out.println("찾고자 하는 도서가 없습니다.");
            return;
        }
        catalogue[idx].setBookPrice(price);
        System.out.println( catalogue[idx].getBookName() + " 도서의 가격이 " + catalogue[idx].getBookPrice() + " 로 수정되었습니다.");
    }

    // 단권 조회
    public void findBooK(String bookName) {
        int idx = searchBookIdx(bookName);
        if(idx == -1){
            System.out.println("찾고자 하는 도서가 없습니다.");
            return;
        }
        System.out.println("도서명 : " + catalogue[idx].getBookName());
        System.out.print("\t저자 : " + catalogue[idx].getBookAuthor());
        System.out.print("\t가격 : " + catalogue[idx].getBookPrice());
    }
    
    // 전체도서조회
    public void listBook() {
        for (Book ele : catalogue) {
            if (ele != null) {
                System.out.print("도서명 : " + ele.getBookName());
                System.out.print("\t저자 : " + ele.getBookAuthor());
                System.out.print("\t가격 : " + ele.getBookPrice());
                System.out.println();
            }
        }        
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


    // null인 인텍스 찾기
    private int findNullIdx() {
        int idx = -1;
        for (int i = 0; i < catalogue.length; i++) {
            if(catalogue[i] == null){
                idx = i;
                break;
            }
        }
        return idx;
    }

    //도서명으로 인덱스 찾기
    private int searchBookIdx(String bookName){
        int idx = -1;
        for (int i = 0; i < catalogue.length; i++) {
            if(catalogue[i] !=null){
                if(catalogue[i].getBookName().equals(bookName)) {
                    idx = i;
                    break;
                }
            }
        }
        return idx;
    }
}
