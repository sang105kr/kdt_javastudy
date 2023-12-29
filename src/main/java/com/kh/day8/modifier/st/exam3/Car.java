package com.kh.day8.modifier.st.exam3;
/*
    static 메소드는 : static 멤버(필드,메소드)만 접근 가능
 */
public class Car {
    private static String model = "테슬라";
    private static int totalCnt;
    private final static int MAX_SPEED = 300;

    private String color;
    private int speed;

    private Car(){
        totalCnt++;
    }

    Car(String color) {
        this();
        this.color = color;
    }

    //속도를 내다
    void speedUp() {
        if(this.speed == MAX_SPEED) {
            return;
        }
        speed++;
    }

    //속도를 줄이다.
    void speedDown(){
        if(this.speed == 0) {
            return;
        }
        speed--;
    }
    
    //현재속도
    int getSpeed() {
        return speed;
    }

    //총생산량
    static int getTotalCnt() {
        return totalCnt;
    }

    //색상 수정
    void setColor(String color) {
        this.color = color;
    }

    //색상 읽기
    String getColor(){
        return color;
    }

    static int getMAX_SPEED(){
       return MAX_SPEED;
    }

    static String getModel(){
        return model;
    }
}
