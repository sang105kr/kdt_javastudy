package com.kh.day6.excercise7.q5;

public class A extends Object{
    A(){
        super(); // 상위클래스의 기본생성자호출
    }

    void averageScore(int... value) {
        int sum = 0;
        double avg = 0.0;

        //case 1) 일반 for문
//        for (int i = 0; i < value.length; i++) {
//            sum += value[i];
//        }

        //case 2) for-each문
        for (int i : value) {
            sum += i;
        }

        avg = (double) sum / value.length;

        System.out.println("avg = " + avg);
    }
}
