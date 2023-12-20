package com.kh.day1.solution;

import java.util.Scanner;

/*
    콘솔로부터 정수를 입력받아 홀수, 짝수를 출력하는 프로그램을 구현하시오
 */
public class Quiz1Solution {
    public static void main(String[] args) {
        //1) 콘솔 입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        //case1)
//        int number = Integer.valueOf(scanner.nextLine());  //문자열을 콘솔로부터 입력받는다
        //case2)
        int number = scanner.nextInt();  //정수를 콘솔로부터 입력받는다

//        double number2 = scanner.nextDouble();   //  실수를 콘솔로부터 입력받는다.
//        boolean flag = scanner.nextBoolean();  //논리값을 콘솔로부터 입력받는다.\
//        System.out.println("input = " + input);


        //2) 짝홀수 판단
        if(number % 2 == 0){
            System.out.println(number + "는 짝수 입니다.");
        }else{
            System.out.println(number + "는 홀수 입니다.");
        }


//        boolean result = ((number % 2) == 0);  // 산술 > 비교 > 대입
        
    }
}
