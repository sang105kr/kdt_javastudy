package com.kh.bank4;

public class Account {

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
    public void deposit(int money) {
        //1회 입금한도는 4만원을 초과할 수 없다.
        if(money > 40_000){
            System.out.println("1회 입금한도는 4만원을 초과할 수 없다.");
            return;
        }

        //예치금액은 10만원 이하로 제한 한다.
        if(balance + money > 100_000){
            System.out.println("예치금액은 10만원 이하로 제한 한다.");
            return;
        }

        //입금처리
        balance += money;
        System.out.println(this);
    }

    //출금
    public void widthdraw(int money) {
        //1회 출금한도는 4만원을 초과할 수 없다.
        if(money > 40_000){
            System.out.println("1회 출금한도는 4만원을 초과할 수 없다.");
            return;
        }

        //마이너스 잔고는 허용하지 않는다.
        if(balance - money < 0){
            System.out.println("잔액이 부족합니다.");
            return;
        }

        //출금처리
        balance -= money;
        System.out.println(this);
    }

//    //조회(개별)
//    public void getAccount(String accountNumber) {
//        //계좌번호로 계좌 찾아오기
//        Account account = findAccount(accountNumber);
//        //계좌를 못찾은 경우
//        if(account == null) return;
//
//        System.out.print("계좌번호 : " + account.accountNumber);
//        System.out.print("\t예금주명 : " + account.accountName);
//        System.out.print("\t잔액 : " + account.balance);
//        System.out.println();
//    }
//
//    //조회(전체)
//    public void listAccount() {
//        int usingAccount = 0;   //사용중인계좌
//        for (Account account : accounts) {
//            if(account == null) continue;
//            usingAccount++;
//            System.out.print("계좌번호 : " + account.accountNumber);
//            System.out.print("\t예금주명 : " + account.accountName);
//            System.out.print("\t잔액 : " + account.balance);
//            System.out.println();
//            System.out.print("사용중인계좌수 : " + usingAccount);
//            System.out.print("\t잔여계좌수 : " + (ACCOUNTS_MAX_SIZE - usingAccount));
//            System.out.println();
//        }
//    }
//


    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return  "계좌번호 : " + accountNumber +
                "\t 예금주명 : " + accountName +
                "\t 잔액 : " + balance + "\n";
    }
}
