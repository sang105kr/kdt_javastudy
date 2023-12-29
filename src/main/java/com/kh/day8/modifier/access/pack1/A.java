package com.kh.day8.modifier.access.pack1;

public class A {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;

    public void print() {
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.print(d);
        System.out.println();
    }
}
