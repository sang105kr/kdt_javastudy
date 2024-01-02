package com.kh.day9.exam1;

public class Main2 {
    public static void main(String[] args) {

        //학생 인스턴스 생성
        Student s1 = new Student();

        //고등학생 인스턴스 생성
        HighStudent h1 = new HighStudent();

        //학생,고등생생 인스턴스에 먹는행위 요청
        s1.eat();
        h1.eat();

        eat(s1);
        eat(h1);
//        //학생 인스턴스 생성
//        Person s2 = new Student();
//
//        //고등학생 인스턴스 생성
//        Person h2 = new HighStudent();
//
//        //학생,고등생생 인스턴스에 먹는행위 요청
//        s2.eat();
//        h2.eat();
    }

    public static void eat(Person person){
        person.eat();
    }

//    public static void eat(Student student){
//        student.eat();
//    }
//
//    public static void eat(HighStudent highStudent){
//        highStudent.eat();
//    }



}
