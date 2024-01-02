package com.kh.day9.exam2;
/*
    디폴트생성자 : 매개변수가 없는 생성자
                클래스내에 생성자메소드가 1개라도 없는경우 컴파일러가 자동 추가한다.
                클래스내에 생성자메소드가 1개라도 있는경우 컴파일러가 자동 추가안한다.

    추상클래스(미완성클래스) :  개념정의가 완성이 안된 클래스
                           인스턴스 생성불가
                           추상메소드가 하나라도 존재하면 추상클래스여야한다.
                           상속을 전제로 하위클래스에서 개념정의를 완성시키는 용도
    추상메소드(미완성메소드) : 본문이 정의 안된 메소드


 */

 abstract public class Person {
    String name;

    public Person(){
//        super();
    }

    public Person(String name){
//        super(); 부모클래스의 기본생성자는 생략가능
        this.name = name;
    }

    abstract public void eat();
    abstract public void smile();
}

