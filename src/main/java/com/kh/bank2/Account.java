package com.kh.bank2;

public class Account {
    //계좌관리
    private static final int ACCOUNTS_MAX_SIZE = 5;
    private static Account[] accounts = new Account[ACCOUNTS_MAX_SIZE];

    //예금주이름, 잔고, 계좌번호
    private String accountName;        //예금주이름
    private int balance;               //잔액
    private String accountNumber;      //계좌번호

    private static int accountNum;     //계좌번호 카운트
    private static final int ACCOUNT_NUM_SIZE = 3; //계좌번호 자리수

    public Account(String accountName){
        this.accountName = accountName;
        //계좌번호생성
        accountNumber = makeAcountNumber(++accountNum);
        //계좌추가
        addAccount();
    }

    //계좌 추가
    private void addAccount() {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = this;
                break;
            }
        }
    }

    // 계좌번호 생성
    private String makeAcountNumber(int accountNum) {
        String str = "" + accountNum;
        int cnt = ACCOUNT_NUM_SIZE - str.length();
        for (int i = 0; i < cnt; i++) {
            str = "0" + str;
        }
        return str;
    }

    //입금
    public void deposit(String accountNumber, int money) {
        balance += money;
    }
    //출금
    public void widthdraw(String accountNumber, int money) {
        balance -= money;
    }

    //조회(개별)
    public void getAccount(String accountNumber) {

    }

    //조회(전체)
    public void listAccount() {
        int usingAccount = 0;   //사용중인계좌
        for (Account account : accounts) {
            if(account == null) continue;
            usingAccount++;
            System.out.print("계좌번호 : " + account.accountNumber);
            System.out.print("\t예금주명 : " + account.accountName);
            System.out.print("\t잔액 : " + account.balance);
            System.out.println();
            System.out.print("사용중인계좌수 : " + usingAccount);
            System.out.print("\t잔여계좌수 : " + (ACCOUNTS_MAX_SIZE - usingAccount));
            System.out.println();
        }
    }


}
