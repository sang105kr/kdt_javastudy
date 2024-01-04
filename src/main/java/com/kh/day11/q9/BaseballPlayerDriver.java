package com.kh.day11.q9;

import java.util.Scanner;

public class BaseballPlayerDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseballPlayer[] bp = new BaseballPlayer[3];

        for (int i = 0; i < bp.length; i++) {
            System.out.println("선수의 이름,위치,안타수,4구수를 입력하세요 ");
            System.out.print("선수 이름 : ");
            String name = scanner.nextLine();
            System.out.print("위치 : ");
            String position = scanner.nextLine();
            System.out.print("안타수 : ");
            int hitCount = scanner.nextInt();
            scanner.nextLine(); // "\n" 엔터키 읽기위함
            System.out.print("4구수 : ");
            int noHit = scanner.nextInt();
            scanner.nextLine();

            //선수 생성
            bp[i] = new BaseballPlayer(name);
            bp[i].setPosition(position);
            bp[i].setNumHits(hitCount);
            bp[i].setNumWalks(noHit);
        }

        for (int i = 0; i < bp.length; i++) {
            System.out.println(bp[i]);
//            System.out.println(bp[i].toString());
        }

        int sumOfHitCont = 0, sumOfNohit = 0;
        for (int i = 0; i < bp.length; i++) {
            sumOfHitCont += bp[i].getNumHits();
            sumOfNohit += bp[i].getNumWalks();
        }

        System.out.println("안타수 총합계 :  " + sumOfHitCont);
        System.out.println("4구수 총합계 : " + sumOfNohit);
    }
}
