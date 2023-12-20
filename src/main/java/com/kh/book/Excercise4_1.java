package com.kh.book;
/*
    학점 부여하기  A(90이상),B(80이상),C(70이상),F(70미만)
 */
public class Excercise4_1 {
    public static void main(String[] args) {
        int score = 65;
        int result = score / 10;
        switch (result) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
        }
    }
}
