package com.kh.day4;

public class Dim1 {
    public static void main(String[] args) {

        int[] arr = new int[3];

        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[1] = 10;
        System.out.println(arr[1]);

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
