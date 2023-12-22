package com.kh.day4;

public class Dim2 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];

//        System.out.println(arr);
//        System.out.println(arr.length); //2 -> 1차원배열 길이(크기)
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[0].length);//3 -> 2차원배열의 크기
//        System.out.println(arr[1].length);//3 -> 2차원배열의 크기
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[0][2]);
//        System.out.println(arr[1][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[1][2]);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
