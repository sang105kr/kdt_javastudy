package com.kh.day4;

public class ArrayTest1 {
    public static void main(String[] args) {
//        int kor = 95;
//        int eng = 85;
//        int math = 76;
//
//        int sum = kor + eng + math;
//        double avg = (double)sum / 3;
//
//        System.out.println("총계 = " + sum);
//        System.out.println("평균 = " + avg);
        
        int[] subjects;         //정수형 배열 선언
        subjects = new int[100];  //정수형 배열 생성

//        System.out.println(subjects.length); //배열의 크기(길이)
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = 80;  //국어
        }
//
////        int sum = subjects[0] + subjects[1] + subjects[2];
        int sum = 0;
        for (int i = 0; i < subjects.length; i++) {
            sum += subjects[i];
        }
        double avg = (double)sum / subjects.length;
//
        System.out.println("총계 = " + sum);
        System.out.println("평균 = " + avg);
    }
}
