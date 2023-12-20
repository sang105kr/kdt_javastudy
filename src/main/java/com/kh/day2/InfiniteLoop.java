package com.kh.day2;
/*
    무한 루프
 */
public class InfiniteLoop {
    public static void main(String[] args) {
        //case 1)
//        for (;;){
//            System.out.println("*");
//        }
        // case 2)
//        for (;true;){
//            System.out.println("*");
//        }

        //case 3)
//        while(true){
//            System.out.println("*");
//        }
        // case 4)
        do {
            System.out.println("*");
        }while(true);
    }
}
