package com.company.homework_7.task_2;

public class Teacher extends Staff {
    private String position = "Teacher";
    private int salary;

    public int getSalary() {
        return salary;
    }

    public Teacher(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public int salary() {
        System.out.println("My salary as a teacher is : " + getSalary());
        return getSalary();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("My name is " + this.getName() + " and I am a " + this.position);
    }
}
