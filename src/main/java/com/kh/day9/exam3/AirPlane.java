package com.kh.day9.exam3;

public class AirPlane implements Flyable{
    @Override
    public void fly() {
        System.out.println("비행기가 날다");
    }
    public void fillOil(){
        System.out.println("주유하다.");
    }
}
