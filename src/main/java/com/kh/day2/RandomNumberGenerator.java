package com.kh.day2;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(3) + 1; // 1~3까지의 정수 발행

            System.out.println("num = " + num);
        }
    }
}
