package com.kh.day9.exam1;


public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
        Student student = new Student();
        student.eat();
        student.study();

        HighStudent highStudent = new HighStudent();
        highStudent.eat();
        highStudent.study();
        highStudent.examEntrance();

//
        int x = 3;
        double y = x;   // 자동형변환(upcasting) : 하위타입이 상위타입에 대입

        Person person2 = (Person)new Student(); //upcasting
        person2.eat();

//        int z = 3.14;
        Student student2 = (Student) person2;//downcasting
        HighStudent highStudent2 = (HighStudent) student2;
        highStudent2.examEntrance();

    }
}
