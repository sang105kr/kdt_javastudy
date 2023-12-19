package com.kh.day1;

public class Variable {
    public static void main(String[] args) {
        int x;   //변수 선언
        x = 10;  //변수 초기화 : 처음 값을 할당
        x = 20;  //변수 재할당

        System.out.println(x);  // x변수값을 콘솔에 출력!

        int y = 10;   //변수선언 + 초기화
        y = 20;      //변수 재할당

        int z;
        z = 10;

        int sum = x + y;   //변수 x값 . 변수 y값을 더한후 sum변수에 초기화
        System.out.println("sum=" + sum);

        int i;   //변수 선언
        i = 100; //변수 초기화
        System.out.println("i=" + i);
    }
}
