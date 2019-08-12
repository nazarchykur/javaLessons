package com.company;

public class SalariedEmployee extends Employee implements ICalculate {

    private String socialSecurityNumber;
    private int hourlyRate;
    private int numberOfHoursWorked;

    public SalariedEmployee(int employeeId, String name, String socialSecurityNumber, int hourlyRate, int numberOfHoursWorked) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public int calculatePay() {
        //System.out.println("the average monthly salary for SalariedEmployee = " + (getHourlyRate() * getNumberOfHoursWorked()));
        return (getHourlyRate() * getNumberOfHoursWorked());
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                " employeeld = " + employeeId +
                ", name = '" + name + '\'' +
                ", the average monthly salary = " + calculatePay() +
                '}';
    }
}
