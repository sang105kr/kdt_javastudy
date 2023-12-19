package com.kh.day1;

import java.util.Scanner;

/*
    문제) 점수에 따른 수우미양가 평가
    90점 이상 - 수
    80이상 90점 미만 - 우
    70이상 80점 미만 - 미
    60이상 70점 미만 - 양
    60점 미만 - 가
 */
public class HakJum3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int score = Integer.valueOf(scanner.nextLine());

        if(score >= 90){//수
            System.out.println("수");
        }else if(score >= 80 && score < 90){//우
            System.out.println("우");
        }else if(score >= 70 && score < 80){//미
            System.out.println("미");
        }else if(score >= 60 && score < 70){//양
            System.out.println("양");
        }else {//가
            System.out.println("가");
        }

    }
}
