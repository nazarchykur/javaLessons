package com.company.homework_7.task_2;

public class Student extends Person {
    private String position = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("My name is " + this.getName() + " and I am a " + this.position);
    }
}
