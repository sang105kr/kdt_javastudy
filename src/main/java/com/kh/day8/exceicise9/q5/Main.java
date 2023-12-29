package com.kh.day8.exceicise9.q5;

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        a1.a = 30;
        A.b = 40;

        a2.a = 50;
        A.b = 60;

        System.out.println(a1.a);
        System.out.println(A.b);

        System.out.println(a2.a);
        System.out.println(A.b);
    }

}
