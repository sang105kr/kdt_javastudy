package com.kh.day8.modifier.st.exam2;

import com.kh.day8.modifier.access.pack2.C;

public class Person {
    String name;
    int age;
    static Car car;

    void smile(){
        System.out.println("웃다");
    }
    void eat(){
        System.out.println("먹다");
    }
    void setCar(Car car){
        this.car = car;
    }
    void drive(){
        car.run();
    }

}
