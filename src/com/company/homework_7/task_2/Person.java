package com.company.homework_7.task_2;

public abstract class Person {
    protected String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();

}
