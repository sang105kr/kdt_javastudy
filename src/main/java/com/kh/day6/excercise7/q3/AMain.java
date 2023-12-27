package com.kh.day6.excercise7.q3;

public class AMain {
    public static void main(String[] args) {
        A a = new A();
        int[] data1 = new int[]{1, 2, 3};
        int[] data2 = {1, 2, 3};
        System.out.println(a.arraySum(data1));
        System.out.println(a.arraySum(data2));
        System.out.println(a.arraySum(new int[]{1,2,3}));
//        System.out.println(a.arraySum({1,2,3}));

//        int[] x = new int[]{1, 2, 3};
//
//        int[] x2;
//        x2 = new int[]{1, 2, 3};
//
//        int[] y = {1,2,3};
//        int[] y2;
//        y2 = {1,2,3};

    }
}
