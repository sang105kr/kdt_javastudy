package com.kh.day1;

import java.util.Scanner;

/*
    문제) 국,영,수 점수를 콘솔에서 입력 받아 총점과 평균을 구하는 프로그램을 작성하시오.
 */
public class KorEngMathJumsu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1) 콘솔에서 국,영,수 점수 입력받기
        System.out.print("국어점수 : ");
        int kor = Integer.valueOf(scanner.nextLine()); //콘솔로 부터 1줄입력받기(엔터를 만날때까지의 값을 문자 읽어들임)

        System.out.print("영어점수 : ");
        int eng = Integer.valueOf(scanner.nextLine());

        System.out.print("수학점수 : ");
        int math = Integer.valueOf(scanner.nextLine());

        //2) 총점 계산하기
        int sum = kor + eng + math;

        //3) 평균 계산하기
        double avg = (double)sum / 3;

        //4) 총점,평균 출력하기
        System.out.println("총점=" + sum);
        System.out.println("평균=" + avg);
    }
}
