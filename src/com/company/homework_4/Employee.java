package com.company.homework_4;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    static int totalHours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getTotalHours() {
        return totalHours;
    }

    public static void setTotalHours(int totalHours) {
        Employee.totalHours = totalHours;
    }

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public int salary(){
        return (rate * hours);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public void changeRate( int amount){
        setRate(amount);
    }

    public double bonuses(double percent){
        System.out.println("The bonus is: " + (percent * salary() / 100));
        return percent * salary() / 100;
    }
}
