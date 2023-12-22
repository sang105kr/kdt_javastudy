package com.kh.day4;
/*
    로또 생성기 (1~45)중 6개 출력 (단, 중복없이)
 */

import java.util.Random;

public class Question3 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] lotto = new int[6];
        //로또번호 생성
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1;
            if(i == 0) continue;
            for (int j = 0; j < i; j++) {
                if(lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }
        }
        
        // 로또번호 출력
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
