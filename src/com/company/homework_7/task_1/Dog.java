package com.company.homework_7.task_1;

public class Dog extends Animal {

    private String name;

    public String getName() {
        return name;
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("dog " + this.getName() + " says woof");
    }

    @Override
    public void feed() {
        System.out.println("dog  " + this.getName() + " want to eat bones and meat");
    }
}
