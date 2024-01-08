package com.kh.day12.q8;

import com.kh.day9.exam5.B;

import java.util.Scanner;

public class CatalogueDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookCatalogue bookCatalogue = new BookCatalogue();

        boolean flag = false;
        while(!flag){

            //도서정보 입력받기
            System.out.print("도서명 : ");
            String bookName = scanner.nextLine();
            System.out.print("저자 : ");
            String bookAuthor = scanner.nextLine();
            System.out.print("가격 : ");
            int bookPrice = scanner.nextInt();
            scanner.nextLine();

            //도서 추가
            Book book = new Book(bookName, bookAuthor, bookPrice);
            bookCatalogue.addToCatalogue(book);
            System.out.println("도서가 추가되었습니다.");

            System.out.print("도서를 추가하겠습니까(y/n)?");
            String go = scanner.nextLine();
            if(go.equalsIgnoreCase("N")){
                flag = true;
            }
        }

        //도서목록 출력
        System.out.println(bookCatalogue);
       
    }
}
