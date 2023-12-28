package com.kh.day6.exam1;
/*
    가상세계에 가상객체를 만드는 방법
    현실/상상 세계의 대상(객체) -> 추상화 -> 클래스(개념정의) -> 인스턴화 -> 인스턴스(가상객체)

    클래스(class) : 개념(명사,동사)설계 도구
     객체(object) : 실세계의 객체, 가상세계의 객체
  인스턴스(instance) : 가상세계의 객체 하나하나를 가리킬때
  인스턴스화(실체화) : 클래스를 통해 객체(인스턴스)를 만드는 과정 (new)
  
  생성자(constructor) : 인스턴스의 초기값을 설정하는 역할
  생성자 오버로딩 : 동일한 이름으로 매개변수의 갯수, 타입을 달리하여 여러개 정의할수 있다.

  this : 미래에 생성될 객체
  this() : 동일 클래스내 생성자 호출

  // import java.lang.*;  기본 패키지는 import하지 않더라도 자동 포함됨.
 */
public class Person {
    //필드 : 명사, 속성
    String name;    // 이름
    int age;        // 나이

    //생성자
    Person(){ super(); }    //기본(default) 생성자

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //메소드 : 동사, 역할, 행위
    //웃다

    /**
     * "웃다"를 콘솔에 출력
     */
    void smile(){
        System.out.println("웃다");
    }
    
    //먹다

    /**
     * "먹다"를 콘솔에 출력
     */
    void eat() {
        System.out.println("먹다");
    }
    
}
