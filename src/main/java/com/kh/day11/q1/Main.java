package com.kh.day11.q1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(111, "홍길동", 90, 80, 70);

        //toString() : 객체 상태를 문자렬로 표현
        System.out.println("student = " + student);

        //평균
        System.out.println("student의 평균 : " + student.getAverage());

        //점수 수정
        student.setScore(1, 100);
        student.setScore(2, 100);
        student.setScore(3, 100);

        //특정과목의 점수 읽어오기
        System.out.println("testscore1의 점수 :" + student.getScore(1));
        System.out.println("testscore2의 점수 :" + student.getScore(2));
        System.out.println("testscore3의 점수 :" + student.getScore(3));


        //toString() : 객체 상태를 문자렬로 표현
        System.out.println("student = " + student);

        //평균
        System.out.println("student의 평균 : " + student.getAverage());

    }
}
