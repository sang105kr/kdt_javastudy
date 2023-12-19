package com.kh.day1;

public class Final {
    public static void main(String[] args) {
        int x;      //변수선언
        x = 10;     //초기화
        x = 20;     //재할당

        int y = x;

        System.out.println("x=" + x);
        System.out.println("y=" + y);

        // 상수 : 한번 초기화된 값을 재할당(변경) 할 수 없다.
        //       대문자 사용
        final int Z; //상수 변수 선언
        Z = 10;      //상수 초기화
        //Z = 20;      //재할당(X)
        System.out.println("z=" + Z);
    }
}
