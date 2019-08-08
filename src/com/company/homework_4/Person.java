package com.company.homework_4;

import java.time.LocalDate;

public class Person {

    private String name;
    private int birthYear;

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int age() {
        int today = LocalDate.now().getYear();
        return today - getBirthYear();
    }

    public void info() {
        System.out.println(getName() + " is " + age() + " years old");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
