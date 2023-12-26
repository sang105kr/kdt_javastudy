package com.kh.day5;
/*
    실행 클래스 : 실행 메소드가 있는 클래스
    실행 메소드 : main메소드
    
    라이브러리 클래스 : 실행 메소드가 없는 클래스

    메소드 :
        - 실행문을 의미있게 묶는 단위.
        - 선언부(반환타입+메소드이름+매개변수) + 본문
 */
public class Method1_2 {
    public static void main(String[] args) {
        System.out.println("main() 시작");

        //메소드호출
        System.out.println("method1()시작");
        System.out.println("method2()시작");
        System.out.println("method2()종료");
        System.out.println("method1()종료");

        System.out.println("main() 종료");
    }

//    public static void method1(){
//        System.out.println("method1()시작");
//        method2();
//        System.out.println("method1()종료");
//    }
//    public static void method2(){
//        System.out.println("method2()시작");
//        System.out.println("method2()종료");
//    }
}
