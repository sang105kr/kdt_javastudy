package com.kh.day3;

import java.util.Scanner;

/*
    사용자로 부터 숫자를 입력받아 '*'를 정사각형 모양으로
    출력하는 프로그램을 구현하시오.(0을 입력하면 프로그램 종료)
    힌트 : 중첩 for문 사용

    number :2
    **
    **
    number : 3
    ***
    ***
    ***
    number : 0
    프로그램 종료!!
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("number : ");
            int number = scanner.nextInt();
            if(number == 0) {
                break;
            }
            for (int i = 1; i <=number ; i++) {
                for (int j = 1; j <= number ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.println("프로그램 종료!!");

    }
}
