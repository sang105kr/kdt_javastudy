package com.kh.day3;
/*
    x, y의 값 교환해보기 ( 재할당 없이)
    x = 10 , y = 20 
    x = 20,  y = 10 
 */
public class Question4 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x=" + x);
        System.out.println("y=" + y);


    }
}
