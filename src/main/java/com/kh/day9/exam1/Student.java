package com.kh.day9.exam1;
import java.lang.*;
public class Student extends Person {
    public Student(){
//        super();
        System.out.println("Student.Student");
    }
    public void study(){
        System.out.println("공부하다.");
    }
    // case1) 재정의
//    public void eat(){
//        System.out.println("많이 먹는다.");
//    }
    // case2) 재정의
    public void eat(){
        super.eat();
        System.out.println("더 먹는다.");
    }    
}
