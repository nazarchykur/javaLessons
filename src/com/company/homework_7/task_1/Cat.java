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
        System.out.println("cat " + name + " says meow");
    }

    @Override
    public void feed() {
        System.out.println("cat " + name + " want to eat milk and meat");
    }
}
