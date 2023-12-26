package com.kh.day5;

import java.util.Scanner;

/*
    ATM기 입출금 구현하기
    제약조건 : 1. 마이너스 통장이 아니다.
              2. 구좌에 최대 10만원까지 입금 가능하다.
              3. 1000원 미만으로 입출금 불가
              4. 메인 메소드 만을 사용하여 구현
    -----------------------------------
    메뉴 : 1. 입금  2.출금  3.잔액  0.종료
    ------------------------------------
    선택 : 1
    입금액 : 10000
    10000원이 입금되었습니다. 잔액 : 10000
    -----------------------------------
    메뉴 : 1. 입금  2.출금  3.잔액  0.종료
    ------------------------------------
    선택 : 3
    잔액 : 10000
    -----------------------------------
    메뉴 : 1. 입금  2.출금  3.잔액  0.종료
    ------------------------------------
    선택 : 2
    출금액 : 5000
    5000원이 출금되었습니다. 잔액 : 5000
    -----------------------------------
    메뉴 : 1. 입금  2.출금  3.잔액  0.종료
    ------------------------------------
    선택 : 2
    출금액 : 10000
    잔액이 부족합니다   잔액 : 5000
    -----------------------------------
    메뉴 : 1. 입금  2.출금  3.잔액  0.종료
    -----------------------------------
    메뉴 : 0
    프로그램 종료!!
 */
public class Question1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;   // 잔액

        boolean stop = false;
        while (!stop) {
            System.out.println("-----------------------------------");
            System.out.println("메뉴 : 1. 입금  2.출금  3.잔액  0.종료");
            System.out.println("-----------------------------------");
            System.out.print("메뉴 >> ");
            int menu = scanner.nextInt();

            boolean stop_depositAmount = false, stop_widthrawAmount = false;
            switch (menu) {
                case 1: // 입금
                    while (!stop_depositAmount) {
                        System.out.print("입금액[0-상위메뉴이동]: ");
                        int depositAmout = scanner.nextInt();
                        //상위 메뉴 이동
                        if( depositAmout == 0) {
                            stop_depositAmount = true;
                            continue;
                        }
                        //체크
                        //1. 음수체크
                        if( depositAmout < 0 ){
                            System.out.println("양수로 입금바랍니다.");
                            continue;
                        }
                        //2.구좌에 최대 10만원까지 입금 가능하다.
                        if( balance + depositAmout > 100_000){
                            System.out.println("구좌에 최대 10만원까지 입금 가능합니다. 잔액 : " + balance);
                            continue;
                        }
                        //3. 1000원 미만으로 입출금 불가
                        if( depositAmout % 1000 != 0 ){
                            System.out.println("1000원 단위로 입금 가능합니다");
                            continue;
                        }

                        //입금처리
                        balance += depositAmout;
                        System.out.println( depositAmout + " 원이 입금되었습니다. 잔액 : " + balance);
                        stop_depositAmount = true;
                    }
                    break;

                case 2: // 출금
                    while (!stop_widthrawAmount) {
                        System.out.print("출금액[0]-상위메뉴로이동: ");
                        int widthrawAmount = scanner.nextInt();

                        //상위 메뉴 이동
                        if( widthrawAmount == 0) {
                            stop_widthrawAmount = true;
                            continue;
                        }

                        //체크
                        //1) 음수체크
                        if( widthrawAmount < 0 ){
                            System.out.println("양수로 입금바랍니다.");
                            continue;
                        }
                        //2) 잔액체크 : 출금액이 더 많으면 출금 불가.
                        if (widthrawAmount > balance) {
                            System.out.println("잔액이 부족합니다. 잔액 : " + balance);
                            continue;
                        }
                        //3) 1000원 미만 단위로 입출금 불가
                        if (widthrawAmount % 1000 != 0) {
                            System.out.println("1000원 단위로 출금 가능합니다");
                            continue;
                        }

                        // 출금 처리
                        balance -= widthrawAmount;
                        System.out.println( widthrawAmount + " 원이 출금되었습니다. 잔액 : " + balance);
                        stop_widthrawAmount = true;
                    }
                    break;

                case 3: // 잔액
                    System.out.println("잔 액 : " + balance);
                    break;

                case 0: // 종료
                    stop = true;
                    continue;

                default:
                    System.out.println("(0~3) 선택 바랍니다.");

            }
        }
        System.out.println("프로그램 종료!!");
    }
}
