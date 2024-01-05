package com.kh.day11.q11;

public class ComplexDriver {
    public static void main(String[] args) {
//        1.	2 + 3i를 나타내는 복소수 객체 x를 생성한다.
        Complex x = new Complex(2, 3);
//        2.	-3 + 7i를 나타내는 복소수 객체 y를 생성한다.
        Complex y = new Complex(-3, 7);

//        3.	z = x – y
        Complex z = new Complex();
        z = z.substract(x,y);

//        4.	x, y, z를 출력한다
        x.print();
        y.print();
        z.print();

    }
}
