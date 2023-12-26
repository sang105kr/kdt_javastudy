package com.kh.day5;
/*
    메소드 오버로딩(overloading) :
        메소드 이름을 동일하게, but 매개변수 갯수, 매개변수 타입은 달라야한다.
        주의) 메소드이름은 같고 매개변수가 동일하면 반환타입에 상관없이 메소드 오버로딩(X)
 */
public class Method3 {
    public static void main(String[] args) {
        int result = add(10, 20);
        int result2 = add(10, 20, 30);

        printScreen(1);
        printScreen(1.0);
        printScreen("1");

    }

    // 정수을 입력 받아 덧셈하는 메소드
    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {

        return 1;
    }

    public static void printScreen(int x) {

    }
    public static void printScreen(double x) {

    }
    public static void printScreen(String x) {

    }
}
