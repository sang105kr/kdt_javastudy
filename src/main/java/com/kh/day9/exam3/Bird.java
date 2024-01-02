package com.kh.day9.exam3;

public class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("새가 날다");
    }
    
    public void eat(){
        System.out.println("먹다");
    }
}
