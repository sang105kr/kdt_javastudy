package com.kh.day6;

public class Method2 {

    public static void modifyValue(int[] arr) {
        arr[0] = 100;
        System.out.println("modifyValue : " + arr[0]);  //100
    }

    public static void main(String[] args) {
        int[] arr = new int[]{50};
        System.out.println("modifyValue() 호출전 : " + arr[0]); //50

        modifyValue(arr);
        System.out.println("modifyValue() 호출후 : " + arr[0]); //100
    }
}
