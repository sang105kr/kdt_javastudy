package com.kh;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;

        // 1 ~ 10까지의 짝수의 합을 구하시오
        int i = 1;
        for ( ; i <= 10; i++) {

            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("i=" + i);

        System.out.println("sum=" + sum);
    }
}
