package com.kh.day5;
/*
    메인 메소드의 매개변수의 역할
        : 프로그램 실행 시 명령행 인자(Command-Line Arguments)를 받아오는 역할로
          프로그램 초기값을 설정할 수 있다.
 */
public class Method5 {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);
        for (String ele : args) {
            System.out.println(ele);
        }
    }
}
