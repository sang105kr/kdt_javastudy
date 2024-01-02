package com.kh.day9.exam4;

public class Parent {
    String instanceField;
    //상속불가
    public Parent(){super();}            // 생성자메소드
    static String staticField;          //클래스 필드
    private String privateField;        //private 필드
    static void staticMethod(){}        //클래스 메소드
    private void privateMethod(){}      //private 메소드
}
