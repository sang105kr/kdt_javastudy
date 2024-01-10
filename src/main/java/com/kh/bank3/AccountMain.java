package com.kh.bank3;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        Account account = null;         //계좌
        String accountName = null;      //예금주명
        String accountNumber = null;    //계좌번호
        int money = 0;                  //입출금액
        while (!stop) {
            System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료");
            System.out.print("선택 >> ");
            int menu = scanner.nextInt();
            scanner.nextLine();  // "\n"
            switch (menu) {
                case 1: //신규
                    System.out.print("예금주명 : ");
                    accountName = scanner.nextLine();
                    account = new Account(accountName);
                    break;
                case 2: //폐지
                    System.out.print("계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    account.closingAccount(accountNumber);
                    break;
                case 3: //입금
                    System.out.print("계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    System.out.print("입금액 : ");
                    money = scanner.nextInt();
                    account.deposit(accountNumber,money);
                    break;
                case 4: //출금
                    System.out.print("계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    System.out.print("출금액 : ");
                    money = scanner.nextInt();
                    account.widthdraw(accountNumber,money);
                    break;
                case 5: // 개별조회
                    System.out.print("계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    account.getAccount(accountNumber);
                    break;
                case 6: //전체 조회
                    account.listAccount();
                    break;
                case 7: //종료
                    stop = true;
                    continue;
                default: //기타
                    System.out.println("(1~7) 선택바랍니다.");
            }
        }
    }
}
