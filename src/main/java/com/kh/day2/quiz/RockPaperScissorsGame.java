package com.kh.day2.quiz;

import java.util.Random;
import java.util.Scanner;

/*
    가위,바위,보 게임 구현하기
    -------------------------------
    메뉴 : 1.가위 2.바위 3.보 4.종료
    -------------------------------
    참여자 : 3
    컴퓨터 : 주먹
    참여자 : 보
    참여자 승!!
    -------------------------------
    메뉴 : 1.가위 2.바위 3.보 4.종료
    -------------------------------
    참여자 : 4
    게임종료합니다!!
 */
public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        while(!stop){
            System.out.println("------------------------------");
            System.out.println(" 메뉴 : 1.가위 2.바위 3.보 4.종료 ");
            System.out.println("------------------------------");
            System.out.print("참여자 : ");
            int menu = scanner.nextInt();

            Random random = new Random();
            int computer = random.nextInt(3) + 1;  // 1(가위) or 2(바위) or 3(보)

            String computerText = "";
            switch (computer) {
                case 1:
                    computerText = "가위";
                    break;
                case 2:
                    computerText = "바위";
                    break;
                case 3:
                    computerText = "보";
                    break;
            }

            String humanText = "";
            switch (menu) {
                case 1:
                    humanText = "가위";
                    break;
                case 2:
                    humanText = "바위";
                    break;
                case 3:
                    humanText = "보";
                    break;
            }
            System.out.println("참여자 : " + humanText);
            System.out.println("컴퓨터 : " + computerText);
            switch (menu) {
                case 1: // 사용자 가위
                    if ( computer == menu){
                        System.out.println("비겼습니다.");
                    }else if( computer == 2 ){ //바위
                        System.out.println("컴퓨터 승!");
                    }else if ( computer == 3) { //보
                        System.out.println("참여자 승!");
                    }
                    break;
                case 2: // 사용자 바위
                    if ( computer == menu){
                        System.out.println("비겼습니다.");
                    }else if( computer == 1 ){  //가위
                        System.out.println("참여자 승!");
                    }else if ( computer == 3) { //보
                        System.out.println("컴퓨터 승!");
                    }
                    break;

                case 3: // 사용자 보
                    if ( computer == menu){
                        System.out.println("비겼습니다.");
                    }else if( computer == 1 ){  //가위
                        System.out.println("컴퓨터 승!");
                    }else if ( computer == 2) { //바위
                        System.out.println("참여자 승!");
                    }
                    break;

                case 4:
                    stop = true;
                    break;
                default:
                    System.out.println("1~4 중 고르세요!!");
            }
        }
        System.out.println("게임종료합니다!!");
    }
}












