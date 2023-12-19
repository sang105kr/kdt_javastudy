package com.kh.day1;

//실행 클래스 : main메소드가 있는 클래스
//라이브러리 클래스 : main메소드가 없는 클래스
public class Method {

    //실행 메소드  : 메소드 이름이 main
    //             프로그램 시작점
    public static void main(String[] args) {
        System.out.println("1");
        int x = 10;
        int y = 20;

        int sum = x + y; // 30
        System.out.println("sum=" + sum); // print 30

        x = 100;
        y = 200;
        sum = sum(x,y); //메소드 호출 300
        System.out.println("sum=" + sum);

        x = 300;
        y = 400;
        sum = sum(x,y); //메소드 호출
        System.out.println("sum=" + sum);
    }

    //메소드
    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
