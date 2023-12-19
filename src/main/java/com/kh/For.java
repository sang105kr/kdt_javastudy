package com.kh;


// 표현식 : 값, 식, 메소드
public class For {
    public static void main(String[] args) {
        // 1 ~ 3 까지 덧셈 하는 코드를 작성
        int i = 6;   //값
        System.out.println("i=" + i);

        int x = 1 + 2 + 3; //식->값
        System.out.println("x=" + x);

        int y = sum(); //메소드->값
        System.out.println("y=" + y);

        int z = sum() + i + x;
        System.out.println("y=" + z);
    }

    // 메소드 정의
    public static int sum() {
        return 1 + 2 +3;
    }
}
