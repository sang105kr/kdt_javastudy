package com.kh.day4;

public class ArrayTest3 {
    public static void main(String[] args) {

        //배열 선언, 생성, 원하는 값으로 초기화
        //case 1)
        int[] subject = new int[]{100, 90, 80};
        for (int i = 0; i < subject.length; i++) {
            System.out.println(subject[i]);
        }
        // 없는 인덱스 접근시 : ArrayIndexOutOfBoundsException 예외 발생
//        System.out.println(subject[3]);

        //case 2)
        int[] subject2 = {100, 90, 80};
        for (int i = 0; i < subject2.length; i++) {
            System.out.println(subject[i]);
        }

        //case 3)
        int[] subject3;
        subject3 = new int[]{100, 90, 80};
        for (int i = 0; i < subject3.length; i++) {
            System.out.println(subject[i]);
        }

        //case 4)
//        int[] subject4;
//        // subject4 = {100, 90, 80};  분리 불가
//        for (int i = 0; i < subject4.length; i++) {
//            System.out.println(subject[i]);
//        }
    }
}
