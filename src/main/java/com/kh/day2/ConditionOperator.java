package com.kh.day2;

public class ConditionOperator {
    public static void main(String[] args) {
        int num = 4;
        //case1)
        if (num % 3 == 0) {
            System.out.println("3의배수");
        }else if(num % 2 == 0){
            System.out.printf("2의배수");
        }else{
            System.out.println("2 또는 3의 배수가 아닌수");
        }
        //case2)
        int x = 1 + 1;

        String result = num % 3 == 0 ? "3의배수" : num % 2 == 0 ? "2의배수" : "2 또는 3의 배수가 아닌수";
        System.out.println(result);
    }
}
