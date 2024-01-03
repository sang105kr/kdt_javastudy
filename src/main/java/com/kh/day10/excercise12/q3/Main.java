package com.kh.day10.excercise12.q3;

/*
    익명클래스 : 이름 없이 정의 되는 클래스
        1.한번만 사용되는 객체를 사용하고자 할때,
          1회성으로 개념정의하고 인스턴스 만들어서 사용하는 용도.
        2. 클래스를 구현하는데 필요한 코드가 매우 적을때.
        3. 코드를 간결하게 만들고자 할때.

 */
public class Main {
    public static void main(String[] args) {
        // 이름있는 클래스
        B b = new B();
        b.abc();

        // 추상클래스를 이용한 익명 클래스
        A a = new A() {
            @Override
            void abc() {
                System.out.println("반갑습니다.");
            }
        };
        a.abc();

        // 인터페이스를 이용한 익명 클래스

        C c = new C() {
            @Override
            public void eat() {
                System.out.println("먹다");
            }
        };
        c.eat();

        // 람다 표현식
        C c2 = () -> System.out.println("많이 먹다");
        c2.eat();
    }
}
