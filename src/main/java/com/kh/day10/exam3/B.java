package com.kh.day10.exam3;

public class B implements A,D{
    @Override
    public void method1() {
        System.out.println("B.method1");
    }

    @Override
    public void method2() {
        A.super.method2();  //다중 인터페이스를 구현할경우 상위타입.super.멤버
        D.super.method2();
        System.out.println("B.method2");
    }
}
