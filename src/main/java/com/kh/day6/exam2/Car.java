package com.kh.day6.exam2;

public class Car {
    //속성
    String color;    // 색상
    int speed;   // 속도

    Car(){
        super();
    }

    Car(String color) {
        this(10);  //동일 클래스 생성자 호출
        this.color = color;
    }

    Car(int speed) {
        this.speed = speed;
    }
    
    //행위
    //달린다.
    void run(){
        System.out.println(this.color + "이 달리다" );
    }
    //출발하다
    void start(){
        System.out.println(this.color + "출발하다");
    }
    //멈추다
    void stop(){
        System.out.println(this.color + "멈추다");
    }
    //시동걸다
    void startCar(){
        System.out.println(this.color + "시동걸다");
    }
    //시동끄다
    void turnOffCar(){
        System.out.println(this.color + "시동끄다");
    }
}
