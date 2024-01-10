package com.kh.bank4;

import com.kh.bank5.Bank;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Bank bank = new Bank(5);
        bank.serviceStart();
    }
}
