package com.kh.day8.modifier;
/*
    제어자 :
       1. 접근제어자(access modifier) : public, protected, default, private
            public : 다른패키지, 동일패키지, 같은 클래스
            protected : 다른패키지(상속관계가있는), 동일패키지, 같은 클래스
            default : 동일패키지, 같은 클래스
            private : 같은 클래스
       2. static
       3. final
 */
public class Test1 {
    public static void main(String[] args) {

    }
    //접근 제한자 public
    public void method1(){

    }
    //접근 제한자 protected
    protected void method2(){

    }
    //접근 제한자 default
    void method3(){

    }
    //접근 제한자 private
    private void method4(){

    }
}
