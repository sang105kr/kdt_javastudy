package com.kh.day9.excercise10.q11;

public class Main {
    public static void main(String[] args) {
//        A a1 = new A(); //x100
//        A a2 = new A(); //x200
//
//        A a3 = a1; //x100
//        System.out.println( a1 == a2); // '==' 참조타입비교는 주소비교(동일객체인지비교)
//        System.out.println( a1 == a3);

        A a1 = new A(3);
        A a2 = new A(3);
        System.out.println( a1 == a2); //false
        System.out.println( a1.equals(a2)); //false
    }
}
