package com.kh.day11.q6;

public class TrangleDriver2 {
    public static void main(String[] args) {

        Triangle[] triangles = {
                new Triangle(3, 5, 7),
                new Triangle(3, 4, 5),
                new Triangle(3, 4, 5)
        };

        for (int i = 0; i < triangles.length; i++) {

            if (triangles[i].is_right()) {
                System.out.println("triangle" + (i+1) + " 은 직삼각형 입니다.");
            } else if (triangles[i].is_isosceles()) {
                System.out.println("triangle" + (i+1) + " 은 이등변삼각형 입니다.");
            } else {
                System.out.println("triangle" + (i+1) + " 은 직각삼각형도 이등변삼각형도 아니다.");
            }
        }
    }
}
