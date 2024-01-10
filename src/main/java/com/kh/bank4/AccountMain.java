package com.kh.bank4;

import java.util.Scanner;

public class AccountMain {
    //계좌관리
    static final int ACCOUNTS_MAX_SIZE = 5;
    static Account[] accounts = new Account[ACCOUNTS_MAX_SIZE];

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
                    addAccount(account);
                    break;
                case 2: //폐지
                    System.out.print("계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    closingAccount(accountNumber);
                    break;
                case 3: //입금
                    System.out.print("계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    System.out.print("입금액 : ");
                    money = scanner.nextInt();
                    account.deposit(money);
                    break;
                case 4: //출금
                    System.out.print("계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    System.out.print("출금액 : ");
                    money = scanner.nextInt();
                    account.widthdraw(money);
                    break;
                case 5: // 개별조회
                    System.out.print("계좌번호 : ");
                    accountNumber = scanner.nextLine();
                    getAccount(accountNumber);
                    break;
                case 6: //전체 조회
                    listAccount();
                    break;
                case 7: //종료
                    stop = true;
                    continue;
                default: //기타
                    System.out.println("(1~7) 선택바랍니다.");
            }
        }
    }

    //계좌 추가
    private static void addAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                System.out.println("신규 계좌와 아래와 같이 생성되었습니다.");
                System.out.println(account);
                return;
            }
        }
        System.out.println("계좌 개설 한도수("+ACCOUNTS_MAX_SIZE+")가 모두 찼습니다.");
    }

    //폐지
    private static void closingAccount(String accountNumber){
        //계좌번호로 계좌 찾아오기
        Account account = findAccount(accountNumber);
        //계좌를 못찾은 경우
        if(account == null) return;

        //잔액이 남아 있는 경우 폐지 불가능 하다.
        if (account.getBalance() > 0) {
            System.out.println("잔액이 존재합니다");
            return;
        }

        //폐지 처리
        account = null;
    }

    //계좌 검색
    private static Account findAccount(String accountNumber) {
        Account account = null;
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i] != null) {
                if (accounts[i].getAccountNumber().equals(accountNumber)) {
                    account = accounts[i];
                    return account;
                }
            }
        }

        System.out.println("찾고자하는 계좌가 없습니다.");
        return account;
    }

    //조회(개별)
    public static void getAccount(String accountNumber) {
        //계좌번호로 계좌 찾아오기
        Account account = findAccount(accountNumber);
        //계좌를 못찾은 경우
        if(account == null) return;

        System.out.print("계좌번호 : " + account.getAccountNumber());
        System.out.print("\t예금주명 : " + account.getAccountName());
        System.out.print("\t잔액 : " + account.getBalance());
        System.out.println();
    }

    //조회(전체)
    public static void listAccount() {
        int usingAccount = 0;   //사용중인계좌
        for (Account account : accounts) {
            if(account == null) continue;
            usingAccount++;
            System.out.print("계좌번호 : " + account.getAccountNumber());
            System.out.print("\t예금주명 : " + account.getAccountName());
            System.out.print("\t잔액 : " + account.getBalance());
            System.out.println();
            System.out.print("사용중인계좌수 : " + usingAccount);
            System.out.print("\t잔여계좌수 : " + (ACCOUNTS_MAX_SIZE - usingAccount));
            System.out.println();
        }
    }
}
