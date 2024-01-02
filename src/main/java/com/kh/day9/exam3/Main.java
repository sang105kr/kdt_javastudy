package com.kh.day9.exam3;
/*
    instanceof : 실제 인스턴스의 타입을 알고자할때 사용하는 연산자
        인스턴스 instance of 타입  => 평가결과는 논리값.
 */
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Flyable bird2 = new Bird();
        bird2.fly();

        Flyable airPlane = new AirPlane();
        airPlane.fly();

        fly(new Bird());
        fly(new AirPlane());

    }

    public static void fly(Flyable flyable){
        flyable.fly();
        if(flyable instanceof Bird){
            Bird b = (Bird) flyable;
            b.eat();
        } else if (flyable instanceof AirPlane) {
            AirPlane a = (AirPlane) flyable;
            a.fillOil();
        }
    }
}
