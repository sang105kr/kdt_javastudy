package com.kh.day10.exam2_2;

public class Circle extends Shape implements Paintable{
    private double radius; //반지름

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void paint() {
        System.out.println("원 도형을 칠하다.");
    }
}
