package com.kh.day11.q5_2;

import java.util.Random;

public class Die {
    private int faceValue; //주사위의 현재 면
    private Random random = new Random();

    public Die() {
        super();
        faceValue = random.nextInt(6) + 1; // 1~6
    }

    //주사위 굴리기
    public int roll(){
        faceValue = random.nextInt(6) + 1;
        return faceValue;
    }

    //현재면 반환
    public int getFaceValue(){
        return faceValue;
    }
}
