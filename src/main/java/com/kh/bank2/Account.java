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
                System.out.println("신규 계좌와 아래와 같이 생성되었습니다.");
                System.out.println(this);
                return;
            }
        }
        System.out.println("계좌 개설 한도수("+ACCOUNTS_MAX_SIZE+")가 모두 찼습니다.");
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
    //폐지
    public void closingAccount(String accountNumber){
        //계좌번호로 계좌 찾아오기
        int idx = findAccount(accountNumber);
        if(idx == -1){
            System.out.println("찾고자하는 계좌가 없습니다.");
            return;
        }
        Account account = accounts[idx];

        //잔액이 남아 있는 경우 폐지 불가능 하다.
        if (account.balance > 0) {
            System.out.println("잔액이 존재합니다");
            return;
        }
        
        //폐지 처리
        account = null;
    }


    //입금
    public void deposit(String accountNumber, int money) {
        //1회 입금한도는 4만원을 초과할 수 없다.
        if(money > 40_000){
            System.out.println("1회 입금한도는 4만원을 초과할 수 없다.");
            return;
        }

        //계좌번호로 계좌 찾아오기
        int idx = findAccount(accountNumber);
        if(idx == -1){
            System.out.println("찾고자하는 계좌가 없습니다.");
            return;
        }
        Account account = accounts[idx];

        //예치금액은 10만원 이하로 제한 한다.
        if(account.balance + money > 100_000){
            System.out.println("예치금액은 10만원 이하로 제한 한다.");
            return;
        }

        //입금처리
        account.balance += money;
        System.out.println(account.toString());
    }
    //출금
    public void widthdraw(String accountNumber, int money) {
        //1회 출금한도는 4만원을 초과할 수 없다.
        if(money > 40_000){
            System.out.println("1회 출금한도는 4만원을 초과할 수 없다.");
            return;
        }

        //계좌번호로 계좌 찾아오기
        int idx = findAccount(accountNumber);
        if(idx == -1){
            System.out.println("찾고자하는 계좌가 없습니다.");
            return;
        }
        Account account = accounts[idx];

        //마이너스 잔고는 허용하지 않는다.
        if(account.balance - money < 0){
            System.out.println("잔액이 부족합니다.");
            return;
        }

        //출금처리
        account.balance -= money;
        System.out.println(account);
    }

    //조회(개별)
    public void getAccount(String accountNumber) {
        //계좌번호로 계좌 찾아오기
        int idx = findAccount(accountNumber);
        if(idx == -1){
            System.out.println("찾고자하는 계좌가 없습니다.");
            return;
        }
        Account account = accounts[idx];
        System.out.print("계좌번호 : " + account.accountNumber);
        System.out.print("\t예금주명 : " + account.accountName);
        System.out.print("\t잔액 : " + account.balance);
        System.out.println();
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

    //계좌 검색
    private int findAccount(String accountNumber) {
        int idx = -1;
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i].accountNumber.equals(accountNumber)){
                idx = i;
                break;
            }
        }

        return idx;
    }

    @Override
    public String toString() {
        return  "계좌번호 : " + accountNumber +
                "\t 예금주명 : " + accountName +
                "\t 잔액 : " + balance + "\n";
    }
}
