package com.kh.day5;
/*
    가변변수 : 메소드의 매개변수로 사용되며 개수가 정해져 있지 않은 변수
        주의) 가변변수는 매개변수 선언시 제일 마지막에 위치해야한다.
 */
public class Method4 {
    public static void main(String[] args) {
        System.out.println(add(10));
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        System.out.println(add(1,2,3,4,5,6,7,8,9,10));

        System.out.println(calculate("+", 1, 2, 3, 4));
        System.out.println(calculate("*", 1, 2, 3, 4));
    }

    public static int add(int... x) {
        int sum = 0;
        for (int ele : x) {
            sum += ele;
        }
        return sum;
    }

    public static int calculate(String operator,int... x) {
        int result = -1;
        switch (operator) {
            case "+":
                result = 0;
                for (int ele : x) {
                    result += ele;
                }
                break;
            case "*" :
                result = 1;
                for (int ele : x) {
                    result *= ele;
                }
                break;
        }
        return result;
    }
}
