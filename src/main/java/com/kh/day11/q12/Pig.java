package com.kh.day11.q12;

public class Pig {
    private int	goal;               // 	목표 점수
    private PairOfDice	dice;       //	주사위 쌍 객체
    private Player	computer;       //	컴퓨터 선수
    private Player	human;          //	사용자 선수
    private Player	currentPlayer;  //  현 선수

    public Pig(int goal) {
        this.goal = goal;
        dice = new PairOfDice();
        computer = new Player(20);
        human = new Player(Player.ASK);
    }

    //	play: 한 선수가 이길 때까지 게임을 반복한다
    public void play(){
        currentPlayer = computer;
        boolean stop = false;
        while (!stop) {
            turnTurn();

            if (currentPlayer.getTotal() >= goal) {
                stop = true;
            }else{
                // 차례변경
                if (currentPlayer == computer) {
                    currentPlayer = human;
                }else{
                    currentPlayer = computer;
                }
            }
        }
        announceWinner();
    }

    //	takeTurn: 한 선수의 순서에 대한 게임을 한다
    public void turnTurn() {
        if(currentPlayer == computer){
            System.out.println("=============");
            System.out.println("computer 차례!");
        }else{
            System.out.println("=============");
            System.out.println("human 차례!");
        }
        System.out.print("현재 점수");
        System.out.print("\t compter : " + computer.getTotal());
        System.out.print("\t thuman : " + human.getTotal());
        System.out.println();
        currentPlayer.roll(dice, goal);
    }
    //	announceWinner: 승자를 발표하고 결과를 출력한다
    public void announceWinner() {
        if (currentPlayer == computer) {
            System.out.println("computer win!!");
        }else{
            System.out.println("human win!!");
        }
        System.out.println("최종결과");
        System.out.println("computer score : " + computer.getTotal());
        System.out.println("human score : " + human.getTotal());
    }
    //	main: Pig 객체를 생성하여 게임을 한다
    public static void main(String[] args) {
        Pig pig = new Pig(50);
        pig.play();
    }


}
