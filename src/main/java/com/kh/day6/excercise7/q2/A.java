package com.kh.day6.excercise7.q2;

import java.lang.*;

public class A extends Object{

    A(){
        super();
    }

    void print(){
        System.out.println("입력값이 없습니다.");
    }
    void print(int x){
        System.out.println("정수 입력값 : " + x);
    }
    void print(double x){
        System.out.println("실수 입력값 : " + x);
    }
    void print(String x){
        System.out.println("문자열 입력값 : " + x);
    }
}
