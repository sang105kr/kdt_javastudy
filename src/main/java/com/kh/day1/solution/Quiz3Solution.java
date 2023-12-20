package com.kh.day1.solution;

import java.util.Scanner;

/*
    콘솔로부터 3개의 정수를 입력받아 가장 큰값을 출력하기
 */
public class Quiz3Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int num1 = scanner.nextInt();
        
        System.out.print("두번째 정수 : ");
        int num2 = scanner.nextInt();
        
        System.out.print("세번째 정수 : ");
        int num3 = scanner.nextInt();

        System.out.print("네번째 정수 : ");
        int num4 = scanner.nextInt();

        int max = num1;
        if( max < num2) {
            max = num2;
        }
        if( max < num3) {
            max = num3;
        }
        if( max < num4) {
            max = num4;
        }
        System.out.println("max = " + max);
    }
}
