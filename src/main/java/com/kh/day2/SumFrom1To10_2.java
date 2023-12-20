package com.kh.day2;

public class SumFrom1To10_2 {
    public static void main(String[] args) {
        case1();    // for
        case2();    // while
        case3();    // do~while
    }

    public static void case1() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0){
                continue;
            }
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public static void case2() {
        int sum = 0;
        int i = 1;          // 초기식
        while (i <= 10) {   // 조건식
            if (i % 2 != 0){
                i++;
                continue;
            }
            sum += i;
            i++;            // 증감식 i = i + 1;
        }
        System.out.println("sum = " + sum);
    }

    public static void case3() {
        int sum = 0;
        int i = 1;          // 초기식
        do {
            if (i % 2 != 0){
                i++;
                continue;
            }
            sum += i;
            i++;            // 증감식
        } while (i<=10);    // 조건식
        System.out.println("sum = " + sum);
    }
}
