package com.kh.day11.q6;

public class TrangleDriver {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3, 5, 7);
        Triangle triangle2 = new Triangle(3, 4, 5);
        Triangle triangle3 = new Triangle(7, 10, 7);


        if(triangle1.is_right()){
            System.out.println("triangle1은 직삼각형 입니다.");
        }else if(triangle1.is_isosceles()){
            System.out.println("triangle1은 이등변삼각형 입니다.");
        }else {
            System.out.println("triangle1은 직각삼각형도 이등변삼각형도 아니다.");
        }
        if(triangle2.is_right()){
            System.out.println("triangle2은 직삼각형 입니다.");
        }else if(triangle2.is_isosceles()){
            System.out.println("triangle2은 이등변삼각형 입니다.");
        }else {
            System.out.println("triangle2은 직각삼각형도 이등변삼각형도 아니다.");
        }
        if(triangle3.is_right()){
            System.out.println("triangle3은 직삼각형 입니다.");
        }else if(triangle3.is_isosceles()){
            System.out.println("triangle3은 이등변삼각형 입니다.");
        }else {
            System.out.println("triangle3은 직각삼각형도 이등변삼각형도 아니다.");
        }

    }
}
