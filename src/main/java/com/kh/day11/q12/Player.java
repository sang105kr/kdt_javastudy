package com.kh.day11.q12;

import java.util.Scanner;

public class Player {
    private int total;              // 	게임에서 얻은 총 점수
    private int round;              //	현 회차에서 얻은 점수
    private int limit;              //	한 회차에서 얻을 수 있는 최대 점수
    public static final int ASK = -1;     //	회차 종료를 위한 메시지

    public Player(int limit) {
        this.limit = limit;
    }

    //	roll: 주사위 쌍을 던지고 결과를 다룬다
    public void roll(PairOfDice pairOfDice, int goal) {

        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            // 주사위 2개 굴리기
            pairOfDice.roll();
            // 주사위 2개의 눈의 수 읽어오기
            int die1 = pairOfDice.getDie1().getFaceValue();
            int die2 = pairOfDice.getDie2().getFaceValue();
            System.out.println("주사위눈 : (" + die1 + "," + die2 + ")");

            // 두개 주사위 중 1개라도 1이 나오면 현 회차 점수를 초기화후 차례를 넘긴다.
            if(die1 == 1 || die2 == 1){
                System.out.println("현 회차에서 얻은 점수가 초기화됩니다.");
                round = 0;
                // 두개 주사위 모두 1이 나오면 현 회차 및 총 점수를 초기화후 차례를 넘긴다.
                if (die1 == 1 && die2 == 1) {
                    System.out.println("총 점수가 초기화됩니다.");
                    total = 0;
                }
                return;
            }

            // 2개 주사위의 눈의수 합
            round = die1 + die2;

            // 목표점수에 다다르면 종료
            if((total + round) >= goal) {
                total += round;
                stop = true;
            }else {
                // human 인경우
                if(limit == ASK) {
                    System.out.print("계속 던지시겠습니까?(y/n) ");
                    String again = scanner.nextLine();
                    if(!again.equalsIgnoreCase("Y")){
                        total += round;
                        continue;
                    };
                // computer 인경우
                }else{
                    if (round >= limit) {
                        total += round;
                        stop = true;
                    }
                }
            }
        }
    }


    //	getPoints: 선수가 얻은 총점을 반환한다
    public int getTotal() {
        return total;
    }
}
