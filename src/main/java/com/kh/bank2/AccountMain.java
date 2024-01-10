package com.kh.bank2;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        Account account = null;
        while (!stop) {
            System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료");
            System.out.print("선택 >> ");
            int menu = scanner.nextInt();
            scanner.nextLine();  // "\n"
            switch (menu) {
                case 1: //신규
                    System.out.print("예금주명 : ");
                    String accountName = scanner.nextLine();
                    account = new Account(accountName);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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
