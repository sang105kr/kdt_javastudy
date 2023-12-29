package com.kh.day8.modifier.access.pack2;

import com.kh.day8.modifier.access.pack1.A;

public class D extends A {
    public void print() {
        System.out.print(a + " ");
        System.out.print(b + " ");
//        System.out.print(c + " ");
//        System.out.print(d + " ");

        System.out.println();
    }
}
