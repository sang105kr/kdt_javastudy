package com.kh.day2;
/*
    구구단 2 ~ 9단까지 출력하기
    결과 :
    2 * 1 = 2
    ...
    2 * 9 = 18

    3 * 1 = 3
    ...
    3 * 9 = 27

    ...
    9 * 1 = 1
    ...
    9 * 9 = 81
 */
public class Gugudan2 {
    public static void main(String[] args) {

        for (int i = 2; i <=9 ; i++) {

            for (int j = 1; j <=9 ; j++) {

                System.out.println( i + " * " + j + " = " + i * j);

            }
        }
    }
}
