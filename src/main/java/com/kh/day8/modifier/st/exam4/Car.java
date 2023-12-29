package com.kh.day8.modifier.st.exam4;
/*
    인스턴스 메소드 : 모든 멤버필드(인스턴스필드,클래스필드) 접근 가능
    클래스 메소드  : 클래스 멤버필드만 접근 가능(인스턴스필드(x))
 */
public class Car {
    private static int totalCnt;
    private int speed;

    Car(){
        totalCnt++;
    }

    static  int getTotoalCnt(){
        return totalCnt;
    }

    int getSpeed() {
        return speed;
    }
}
