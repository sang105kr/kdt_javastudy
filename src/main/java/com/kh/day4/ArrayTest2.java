package com.kh.day4;
// 변수 : 메모리상에 하나의 값을 저장할 수 있는 기억공간의 이름

public class ArrayTest2 {
    public static void main(String[] args) {

        //case 1)
//        int[] subjects;             // 정수형 배열 선언
//        subjects = new int[3];      // 정수형 배열 생성 및 타입의 디폴트 값으로 초기화

        //case2)
        int[] subjects = new int[3];


        System.out.println(subjects);

        for (int i=0; i<subjects.length; i++) {
            System.out.println(subjects[i]);
        }

        //배열 요소에 값 재할당
        subjects[0] = 10;
        subjects[1] = 20;
        subjects[2] = 30;

        for (int i=0; i<subjects.length; i++) {
            System.out.println(subjects[i]);
        }
    }
}
