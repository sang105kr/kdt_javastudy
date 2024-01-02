package com.kh.day9.excercise10.q8;
/*
    필드와 정적 메소드는 참조 변수의 타입에 따라 접근하고,
    인스턴스 메소드는 실제 인스턴스의 타입에 따라 접근한다.
    자바에서 인스턴스 메소드만 재정의 가능하다.
 */
public class Main {
    public static void main(String[] args) {
        A ab = new B();
        System.out.println("ab.m = " + ab.m);
        System.out.println("ab.n = " + ab.n);
        ab.method1();
        ab.method2();
    }
}
