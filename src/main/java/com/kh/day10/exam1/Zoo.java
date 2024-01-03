package com.kh.day10.exam1;

public class Zoo {
    Animal[] animals;
    int index;
    Zoo(int size) {
        animals = new Animal[size];
    }

    //동물추가
    void addAnimal(Animal animal){
        animals[index++] = animal;
    }

    //동물들이 소리 내게 하기
    void makeAnimalsSound(){
        for (Animal animal : animals) {
            animal.sound();
        }
    }
    
}
