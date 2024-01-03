package com.kh.day10.exam2_2;

public class Trangle extends Shape implements Paintable{
    private double base; //밑변
    private double height; //높이

    Trangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return base * height / 2;
    }

    @Override
    public void paint() {
        System.out.println("삼각형 도형을 칧다.");
    }
}
