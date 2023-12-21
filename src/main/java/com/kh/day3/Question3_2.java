package com.kh.day3;

import java.util.Random;
import java.util.Scanner;

/*
    1~10까지의 임의의 정수값 맞추기
    제약 조건 : 3번의 기회가 주어짐. 3번위 기회를 놓치면 꽝!

    번호 : 5
    작다
    번호 : 3
    작다
    번호 : 2
    빙고!
 */
public class Question3_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(10) + 1;

        boolean stop = false;
        int cnt = 0; // 틀린횟수

        System.out.println("(1~10) 숫자를 맞춰보세요 : ");
        while (!stop) {
            System.out.print("숫자 : ");
            int answer = scanner.nextInt();

            //맞췄을때
            if(number == answer){
                System.out.println("빙고!!");
                stop = true;
                
            //틀렸을때    
            }else{
                cnt++;
                if( answer > number) {
                    System.out.println("크다");
                }else{
                    System.out.println("작다");
                }
                // 3번 틀렸을때
                if(cnt == 3){
                    stop = true;
                    System.out.println("꽝!");
                    System.out.println("정답은 : " + number + "입니다");
                }
            }
        }
    }
}
