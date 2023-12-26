package com.kh.day5;
/*
    실행 클래스 : 실행 메소드가 있는 클래스
    실행 메소드 : main메소드
    
    라이브러리 클래스 : 실행 메소드가 없는 클래스

    메소드 :
        - 실행문을 의미있게 묶는 단위.
        - 선언부(제어자+반환타입(void, 기본형, 참조형)+메소드이름+매개변수) + 본문
        - 메소드 마지막에 return문이 존재한다 (반환타입이 void면 생략가능)

    void : 메소드를 호출한곳에 반환할값이 없음을 뜻함.
 */
public class Method1 {
    public static void main(String[] args) {
        System.out.println("main() 시작");

        //메소드호출
        method1();

        for (int i = 0; i < 2; i++) {
            method2();
        }

        System.out.println("main() 종료");
//        return;
    }

    public static void method1(){
        System.out.println("method1()시작");
        method2();
        System.out.println("method1()종료");
        //return;
    }
    public static void method2(){
        System.out.println("method2()시작");
        System.out.println("method2()종료");
       // return;
    }
}
