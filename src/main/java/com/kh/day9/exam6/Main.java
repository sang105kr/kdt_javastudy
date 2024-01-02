package com.kh.day9.exam6;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();


        Student student2 = new Student();
        student2.eat();
        System.out.println(student2.name);

        Person person2 = (Person)student2;
        person2.eat();
        System.out.println(person2.name);

    }
}
