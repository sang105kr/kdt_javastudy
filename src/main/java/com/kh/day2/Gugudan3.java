package com.kh.day2;
/*
    구구단 2 ~ 9단중 짝수단 출력하기
    결과 :
    2 * 1 = 2
    ...
    2 * 9 = 18

    4 * 1 = 4
    ...
    4 * 9 = 36

    ...
    8* 1 = 8
    ...
    8 * 9 = 72
 */
public class Gugudan3 {
    public static void main(String[] args) {

        for (int i = 2; i <=9 ; i++) {
//            if( i % 2 != 0){
//                continue;  // 이하 로직은 수행되지 않고 증감식으로 이동
//            }

            if( i == 5) {
                break;  // 가장 가까운 반복문을 빠져나온다.
            }
            for (int j = 1; j <=9 ; j++) {

                System.out.println( i + " * " + j + " = " + i * j);

            }

        }
    }
}
