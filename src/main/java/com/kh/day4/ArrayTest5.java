package com.kh.day4;

public class ArrayTest5 {
    public static void main(String[] args) {
        method1();
        method2();
    }

   public static void method1(){
       // 정수형 2차원 배열 선언, 생성, 초기화( 타입의 디폴트값 )
       int[][] jumsu = new int[2][2];

       // 재할당.
       jumsu[0][0] = 1;
       jumsu[0][1] = 2;
       jumsu[1][0] = 3;
       jumsu[1][1] = 4;

       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 2; j++) {
               System.out.print(jumsu[i][j] + " ");
           }
           System.out.println();
       }
   }

   public static void method2(){

   }



}
