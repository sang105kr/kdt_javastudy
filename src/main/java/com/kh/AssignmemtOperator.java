package com.kh;

//대입연산자 : = , += , -=, *= , /= ,%=
public class AssignmemtOperator {
    public static void main(String[] args) {
        int x = 10;

        x = x + 10;
        System.out.println("x = " + x);

        x += 10;  // x = x + 10
        System.out.println("x = " + x);

        x -= 10;  // x = x - 10
        System.out.println("x = " + x);

        x *= 10;  // x = x * 10
        System.out.println("x = " + x);

        x /= 10;  // x = x / 10
        System.out.println("x = " + x);

        x %= 10;  // x = x % 10
        System.out.println("x = " + x);


    }
}
