package com.kh.day2;

public class Switch {
    public static void main(String[] args) {
        int number = 11;
        switch (number) { // 정수,문자열,열거형(enum)  , 실수(x)
            case 1:
                System.out.println(1);
                break; // switch문을 빠져나온다.
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("etc");
        }
    }
}
