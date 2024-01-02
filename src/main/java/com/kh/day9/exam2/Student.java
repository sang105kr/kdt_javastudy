package com.kh.day9.exam2;
/*
    @Override : 재정의 어노테이션 - 재정의할 메소드의 선언부와동일한 메소드가 존재하는지 부모클래스에서 체크한다.
    
    final : 최종, 마지막
    final + 변수 : 재할당불가
    final + 클래스 : 하위크래스로 개념확장불가
    final + 메소드 : 하위클래스에서 재정의불가
 */
public class Student extends Person{

    @Override
    public void eat(){
        System.out.println("먹다");
    }

    @Override
    public void smile() {
        System.out.println("웃다");
    }

    final public void study(){
        System.out.println("공부하다");
    }
}
