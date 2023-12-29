package com.kh.day8.exam1;
/*
    외부클래스 : public 클래스가 외부에 정의된 클래스

    ** 하나의 java파일에 public class는 1개만 존재해야하고
        파일 이름은 public class명과 동일 해야한다.
 */
class A {
    A(){
        super();
        System.out.println("A클래스 생성자 호출됨!");
    }
}
class B {
    B(){
        super();
        System.out.println("B클래스 생성자 호출됨!");
    }
}
public class ExternalClass {
    String field1;
    int field2;

    public static void main(String[] args) {
        System.out.println("main()시작");
        A a = new A();
        B b = new B();
        method1();
        System.out.println("main()종료");
    }

    public static void method1() {
        System.out.println("method1()호출됨");
        method2();
    }
    public static void method2() {
        System.out.println("method2()호출됨");
    }
}
