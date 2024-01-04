package com.kh.day11.q6;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    // 직삼각형인지 판단
    public boolean is_right(){
        boolean isRight = false;

        // 직삼각형 : 빗변제곱 = 한변의길이 제곱 & 다른한변의 길이 제곱
        if( side1 * side1 == side2 * side2 + side3 * side3 ||
                side2 * side2 == side1 * side1 + side3 * side3 ||
                    side3 * side3 == side1 * side1 + side2 * side2){
            isRight = true;
        }

        return isRight;
    }
    // 이등변삼각형인지 판단
    public boolean is_isosceles(){
        boolean isRight = false;

        if (side1 == side2 || side2 == side3 || side3 == side1) {
            isRight = true;
        }

        return isRight;
    }
}
