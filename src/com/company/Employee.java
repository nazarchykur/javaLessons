package com.company;

public class Employee {
    protected int employeeId;
    protected String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
