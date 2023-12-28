package com.kh.day7.vending;

import java.util.Scanner;

/*
    음료 자판기 구현하기
    메뉴 : "콜라","사이다","커피"
    가격 : 1000, 800, 1500

    실행결과
    현재잔액 : 0
    투입액[0-종료] : 2000
    메뉴 : 1.콜라 2.사이다 3.커피
    선택 >> 3
    커피를 선택했습니다.
    거스름돈 : 500

    현재잔액 : 0
    투입액[0-종료] : 500
    메뉴 : 1.콜라 2.사이다 3.커피
    선택 >> 3
    잔액이 부족합니다. 커피 : 1500원 입니다.

    case1) 잔액으로 구매상품이 있을경우 : 메뉴선택
    현재잔액 : 500
    메뉴 : 1.콜라 2.사이다 3.커피
    선택 >> 3

    case2) 잔액으로 구매상품이 없는경우 : 추가 투입 or 종료
    현재잔액 : 500
    투입액[0-종료] : 500

 */
public class VendingMachine {
    //속성
    int balance;    //잔액
    String[] drinks = {"콜라", "사이다", "커피"};  //메뉴
    int[] prices = {1000, 800, 1500};   //가격

    //행위
    void run(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            while (true) {
                System.out.println("현재잔액 : " + balance);
                System.out.print("투입액[0-종료] : ");
                int money = scanner.nextInt();
                balance += money;
                if(balance == 0){
                    return;
                }
                // 잔액이 최소 가격 메뉴보다 큰경우 다음으로 진행
                if(balance >= minPrice(prices)){
                    break;
                }
            }

            int menu = -1;
            do {
                System.out.println("메뉴 : 1.콜라(1000) 2.사이다(800) 3.커피(1500)");
                System.out.print("선택 >> ");
                menu = scanner.nextInt();
                if(menu >=1 && menu <=3){
                    break;
                }
            } while (true);

            String selectedDrink = drinks[menu-1];  // 선택한 음료
            int priceOfDrink = prices[menu-1];      // 선택한 음료 가격

            System.out.println(selectedDrink + "를 선택했습니다.");
            balance -= priceOfDrink;
            System.out.println("거스름돈 : " + balance);
            balance = 0;
        }

    }

    // 최소가격을 찾는 메소드
    private int minPrice(int[] prices) {
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if( min > prices[i]) {
                min = prices[i];
            }
        }
        return min;
    }

}
