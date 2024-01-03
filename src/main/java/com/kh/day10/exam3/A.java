package com.kh.day10.exam3;
/*
    인터페이스의 특징
        1. 모든 멤버는 public
        2. 모든 필드는 상수로 public static final
        3. 타입으로 사용됨, 인스턴스 생성 불가
        4. 다중 구현 , 다중 상속
    인터페이스 멤버 :
        필드 : 상수,
        메소드 :
            추상메소드 : 본문이 없는 미완성 메소드
            디폴트 메소드 : 하위호환성.
            클래스 메소드 : 유틸리티 메소드
 */
public interface A {
    double PI = 3.14; //public static final 생략가능

    //추상메소드
    void method1();    // public abstract 생략됨.

    //디폴드메소드
    default void method2(){
        System.out.println("A.method2");
    }
    //클래스메소드
    static double calculateCicleArea(double radius){
        return radius * radius * PI;
    }
}
