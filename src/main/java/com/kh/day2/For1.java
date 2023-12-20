package com.kh.day2;

public class For1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            //case1)
//            sum = sum + i;
            //case2)
            sum += i;  // sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }
}
