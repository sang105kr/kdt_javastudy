package com.kh.day8.modifier.st.exam2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

//        System.out.println("hello");
        System.out.println(Person.car);
        Person.car.run();

        Car car = new Car();
        person.setCar(car);

        Car car2 = new Car();
        person.setCar(car2);
        person.drive();
    }
}
