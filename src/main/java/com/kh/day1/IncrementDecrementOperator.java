package com.kh.day1;

/*
    증감 연산자 : ++ , --
*/
public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int x = 10;
        
        ++x;  // x = x + 1
        System.out.println("x = " + x);

        x++;  // x = x + 1
        System.out.println("x = " + x);
        
        x += 1; // x = x + 1
        System.out.println("x = " + x);

        --x;  // x = x - 1
        System.out.println("x = " + x);

        x--;  // x = x - 1
        System.out.println("x = " + x);

        x -= 1; // x = x - 1
        System.out.println("x = " + x);
    }
}
