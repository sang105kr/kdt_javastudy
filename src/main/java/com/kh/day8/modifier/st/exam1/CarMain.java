package com.kh.day8.modifier.st.exam1;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
//        System.out.println(car.cnt);
        car.cnt = 10;
        System.out.println(car.cnt + "/" + car.cnt2);


        Car car2 = new Car();
//        System.out.println(car2.cnt);
        car2.cnt = 20;
        System.out.println(car2.cnt + "/" + car2.cnt2);

        Car car3 = new Car();
//        System.out.println(car3.cnt);
        car3.cnt = 30;
        System.out.println(car3.cnt + "/" + car3.cnt2);

        System.out.println(car.cnt + "/" + car2.cnt + "/" + car3.cnt);
        System.out.println(car.cnt2 + "/" + car2.cnt2 + "/" + car3.cnt2);
        System.out.println(Car.cnt2);

        car.method1();
        car2.method1();
        car3.method1();

    }
}
