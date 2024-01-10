package com.kh.day13.q9_2;

import java.util.Scanner;

public class CartDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShoppingCart scart = new ShoppingCart(); //ShoppingCart 객체
        String itemName = null; // 구매하는 상품의 이름
        int itemPrice = 0;      // 구매하는 상품의 가격
        int	itemQuantity = 0;   // 구매하는 상품의 수량
        boolean flag = false;   //상품 추가 여부 확인
        while (!flag) {
            //①	구매하는 상품의 이름 이름, 가격과 수량을 입력 받는다.
            System.out.println("상품정보를 입력하세요");
            System.out.print("상품명 : ");
            itemName = scanner.nextLine();
            System.out.print("가격 : ");
            itemPrice = scanner.nextInt();
            scanner.nextLine();
            System.out.print("수량 : ");
            itemQuantity = scanner.nextInt();
            scanner.nextLine();

            //②	장바구니에 입력 받은 상품을 추가한다.
            scart.addToCart(new Item(itemName, itemPrice, itemQuantity));

            //③	추가할 상품이 있는지 요청하고 사용자 입력 값을  flag에 저장한다.
            System.out.print("상품을 계속 추가하시겠습니까?(예/아니오)");
            String answer = scanner.nextLine();
            if(!answer.equals("예")){
                flag = true;
                break;
            }
        }
        System.out.println("총 결재액 : " + scart.getTotalPrice());
    }
}
