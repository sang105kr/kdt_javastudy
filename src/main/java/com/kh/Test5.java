package com.kh;

//비교연산자 :  ==(같다), !=(같지않다), >(크다), <(작다), >=(이상) , <=(이하)
public class Test5 {
    public static void main(String[] args) {
        int number = 6;

        int mod = number % 2;

        System.out.println("나머지 : " + mod);
        if (mod == 0){
            System.out.println("짝수");    
        }else {
            System.out.println("홀수");
        }
    }
}
