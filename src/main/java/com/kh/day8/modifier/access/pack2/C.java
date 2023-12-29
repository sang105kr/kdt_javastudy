package com.kh.day8.modifier.access.pack2;

import com.kh.day8.modifier.access.pack1.A;

public class C {
    public void print() {
        A a = new A();

        System.out.print(a.a + " ");
//        System.out.print(a.b + " ");
//        System.out.print(a.c + " ");
//        System.out.print(a.d + " ");

        System.out.println();
    }
}
