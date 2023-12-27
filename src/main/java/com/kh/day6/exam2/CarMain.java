package com.kh.day6.exam2;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car();

        System.out.println("색상 : " + c1.color);
        System.out.println("속도 : " + c1.speed);

        c1.color = "빨강";
        System.out.println("색상 : " + c1.color);
        System.out.println("속도 : " + c1.speed);

        c1.startCar();
        c1.run();
        c1.stop();
        c1.turnOffCar();

        Car c2 = new Car("검정");

        c2.startCar();
        c2.run();
        c2.stop();
        c2.turnOffCar();
    }
}
