package com.kh.day9.excercise10.q11;
/*
    동일 비교 : 인스턴스의 주소 비교
    동등 비교 : 인스턴스의 내용 비교

    Object.equals() : 기본적으로는 '==' 비교를함. 즉  주소비교를 한다.
    따라서 동등 비교를 위해서는 하위클래스에서 재정의해서 동등비교용도로 사용됨.
 */
public class A {
    int data;

    public A() {
//        super();
    }

    public A(int data) {
//        super();
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof A){
            A a = (A) obj;
            if(this.data == a.data) {
                return true;
            }
        }
        return false;
    }
}
