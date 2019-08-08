package com.company.homework_7.task_1;

public class Cat extends Animal {

    private String name;

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("cat " + this.getName() + " says meow");
    }

    @Override
    public void feed() {
        System.out.println("cat " + this.getName() + " want to eat milk and meat");
    }
}
