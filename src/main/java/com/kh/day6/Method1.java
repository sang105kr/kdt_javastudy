package com.kh.day6;

public class Method1 {

    public static void modifyValue(int value) {
        value = 100;
        System.out.println("modifyValue : " + value);   //100
    }

    public static void main(String[] args) {
        int value = 50;
        System.out.println("modifyValue() 호출전 : " + value); //50

        modifyValue(value);
        System.out.println("modifyValue() 호출후 : " + value); //50
    }
}
