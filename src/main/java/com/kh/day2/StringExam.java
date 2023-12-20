package com.kh.day2;
/*
    문자열 비교는 == 가 아닌 equals()메소드 사용
 */
public class StringExam {
    public static void main(String[] args) {
        String name = "홍길동";
        String name2 = "홍길동";
        String name3 = new String("홍길동");

        System.out.println("name=" + name);
        System.out.println("name2=" + name2);
        System.out.println("name3=" + name3);


        if( name == name2){
            System.out.println("같다");
        }else{
            System.out.println("다르다");
        }

        if( name == name3){
            System.out.println("같다");
        }else{
            System.out.println("다르다");
        }

        if( name.equals(name3)){
            System.out.println("같다");
        }else{
            System.out.println("다르다");
        }
    }
}
