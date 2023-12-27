package com.kh.day6.exam1;



import java.util.Random;
import java.util.Scanner;

/*
    표준 클래스 -> 표준 라이브러리
    사용자 정의 클래스 -> 사용자정의 라이브러리
    제3자가 정의한 클래스 -> 3th party 라이브러리 (유료, 무료)

 */
public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();  // 실체, 인스턴스
        person.name = "홍길동";
        person.age = 30;

        person.smile();
        person.eat();

        Person person2 = new Person();
        person2.name = "홍길순";
        person2.age = 20;

        person2.smile();
        person2.eat();

        Person[] persons = new Person[2];
        persons[0] = person;
        persons[1] = person2;

        for (int i = 0; i < persons.length; i++) {
            persons[i].smile();
        }

        for (Person p : persons) {
            p.eat();
        }

        Person person3 = new Person("홍길서");
        System.out.println(person3.name);
        System.out.println(person3.age);

        Person person4 = new Person("홍길남", 40);
        System.out.println(person4.name);
        System.out.println(person4.age);

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();

    }
}
