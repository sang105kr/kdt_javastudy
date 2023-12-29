package com.kh.day8.q3;

public class MathUtil {
    private static int result;
    static {
        int x = 5;
        result = factorial(x);
        //System.out.println("result = " + result);
    }

    private static int factorial(int x){
        if( x==0 || x==1 ){
            return 1;
        }else {
            return x * factorial(x - 1);
        }
    }
    static int getResult() {
        return result;
    }

}
