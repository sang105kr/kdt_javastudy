package com.kh.day8.exam3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        person.smile();

        Student student = new Student();
        student.eat();
        student.smile();
        student.study();

        HightStudent hightStudent = new HightStudent();
        hightStudent.eat();
        hightStudent.smile();
        hightStudent.study();
        hightStudent.examEntrance();


        Student student2 = (Student)hightStudent;
        HightStudent hightStudent2 = (HightStudent)student2;

        HightStudent hightStudent3 = (HightStudent)student;
        hightStudent3.examEntrance(); // 컴파일시에는 오류가 없으나 런타입시에 캐스팅 예외 발생

    }
}
