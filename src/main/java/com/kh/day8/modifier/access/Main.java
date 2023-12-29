package com.kh.day8.modifier.access;

import com.kh.day8.modifier.access.pack1.*;
import com.kh.day8.modifier.access.pack2.*;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();

    }
}
