package com.kh.day12.q8;

import com.kh.day9.exam5.B;
/*
    메뉴: 1.추가 2.제거 3.수정(가격) 4.조회(단권) 5.조회(전체) 6.종료
    선택 >> 2
    도서명 : 도서명1
    도서명1가 제거되었습니다 or 찾고자하는 도서가 없습니다.
    선택 >> 3
    도서명 : 도서명2
    현재가격 : 10000
    수정가격 : 12000
    도서명2의 가격이 수정되었습니다.
    선택 >> 4
    도서명 : 도서명3
    도서명 : 도서명3, 저자 : 저자3 , 가격 : 20000
    선택 >> 5
    도서명 : 도서명1, 저자 : 저자1 , 가격 : 10000
    도서명 : 도서명2, 저자 : 저자2 , 가격 : 20000
    도서명 : 도서명3, 저자 : 저자3 , 가격 : 30000
 */
import java.util.Scanner;

public class CatalogueDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookCatalogue bookCatalogue = new BookCatalogue();

        String bookName = null;
        String bookAuthor = null;
        int bookPrice = 0;

        boolean flag = false;
        while(!flag){
            System.out.println("메뉴: 1.추가 2.제거 3.수정(가격) 4.조회(단권) 5.조회(전체) 6.종료");
            System.out.print("선택 >> ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1: //추가
                    //도서정보 입력받기
                    System.out.print("도서명 : ");
                    bookName = scanner.nextLine();
                    System.out.print("저자 : ");
                    bookAuthor = scanner.nextLine();
                    System.out.print("가격 : ");
                    bookPrice = scanner.nextInt();
                    scanner.nextLine();

                    bookCatalogue.addToCatalogue(bookName,bookAuthor,bookPrice);
                    break;
                case 2: //제거
                    System.out.print("도서명 : ");
                    bookName = scanner.nextLine();
                    bookCatalogue.deleteBook(bookName);
                    break;
                case 3: //수정(가격)
                    System.out.print("도서명 : ");
                    bookName = scanner.nextLine();
                    System.out.print("가격 : ");
                    bookPrice = scanner.nextInt();
                    scanner.nextLine();
                    bookCatalogue.chagneBookPrice(bookName,bookPrice);                    
                    break;
                case 4: //조회(단권)
                    System.out.print("도서명 : ");
                    bookName = scanner.nextLine();
                    bookCatalogue.findBooK(bookName);
                    break;
                case 5: //조회(전체)
                    bookCatalogue.listBook();
                    break;
                case 6: //종료
                    flag = true;
                    continue;
            }

        }
       
    }
}
