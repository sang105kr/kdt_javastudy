package com.kh.day6;

public class DataType {
    public static void main(String[] args) {

        byte x = -128;   // 1byte : -128 ~ 127
        char c = 65;       // 2byte : 0~65535
        System.out.println((short)c);

        for (int i = 1; i < 100; i++) {
            System.out.println((char)i);
        }

        short s = -32768;   // 2byte : -32768 ~ 32767
        int i = -2_147_483_648;   // 4byte : -2,147,483,648 ~ 2,147,483,647
        long l = -9_2223_327_036_854_808L;  // 8byte : -9,2223,327,036,854,808 ~ 9,2223,327,036,854,807

        long l2 = 1L;

        // switch문에 정수는 올수 있지만 long 타입은 제외
//        switch (l2) {
//
//        }
    }
}
