package com.kh.day5;
/*
    메소드 매개변수의 형변환
 */
public class Method6 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        method(x,y);    // 자동형변환

        double i = 10; // 10.0
        double j = 20; // 20.0
        method2((int)i,(int)j); // 10,10  //강제형변환
    }

    public static double method(double x, double y) {
        return x + y;
    }

    public static int method2(int x, int y) {
        return x + y;
    }
}
