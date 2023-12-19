package com.kh.day1;

public class IncrementDecrementOperator2 {
    public static void main(String[] args) {
        int x = 10;
        int y;

        y = ++x;  // 자기자신을 1증가시킨후 식에 참여
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        y = x++; // 식에 참여후 자기자신을 1증가
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int z = ++x + y++;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
}
