package com.company.homework_7.task_2;

public class Cleaner extends Staff {
    private String position = "Cleaner";
    private int salary;

    public Cleaner(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int salary() {
        System.out.println("My salary as a cleaner is : " + this.getSalary());
        return this.getSalary();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("My name is " + this.getName() + " and I am a " + this.position);
    }
}
