package com.company.homework_7.task_2;

public abstract class Staff extends Person {

    public Staff(String name) {
        super(name);
    }

    private String position = "Staff";

    public abstract int salary();

    @Override
    public void print() {
        System.out.println(" I am a " + this.position);
    }
}
