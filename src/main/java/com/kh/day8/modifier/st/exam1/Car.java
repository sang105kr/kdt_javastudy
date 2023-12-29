package com.kh.day8.modifier.st.exam1;
/*
    인스턴스 필드 : 인스턴스별로 사용되는 필드. 
    클래스 필드 : 클래스 레벨에서 사용되는 필드.(인스턴스가 공유하는 필드)
                인스턴스 생성하지 않고 사용되는 필드.
    
    인스턴스 메소드 : 인스턴스별로 실행되는 메소드
    클래스 메소드 : 인스턴스를 생성하지 않고 실핼할수 있는 메소드


    클래스필드, 클래스메소드는 "클래스명.멤버" 로 사용.
 */
public class Car {
    //필드
    //인스턴스 필드
    int cnt;

    //클래스 필드, 정적 필드, static 필드
    static int cnt2;
    Car(){
        cnt++;
        cnt2++;
    }

    //인스턴스 메소드
    void method1() {
        System.out.println("달린다.");
    }

    //클래스 메소드,정정메소드,static 메소드
    static void method2() {

    }
}
