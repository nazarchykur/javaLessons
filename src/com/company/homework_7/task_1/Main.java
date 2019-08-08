package com.company.homework_7.task_1;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat("Kiti");
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Alpha");

        Animal[] animals = {cat1, cat2, dog1, dog2};

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }

    }



}
