package com.kh.day9.exam3;
/*
    interface :
        행위를 중심으로 종의 개념이 아닌 횡의개념 정의
        멤버로 상수,추상메소드(미완성메소드),default메소드,static메소드,private메소드
        모든 멤버의 접근 제한자는 public
        인스턴스 생성불가. 타입으로서 사용가능
 */
public interface Flyable {
    String field = ""; // public static final 생락됨.
    void fly(); //public abstract 생략됨.
}
