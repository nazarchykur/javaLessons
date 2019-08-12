package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Employee emp_1 = new SalariedEmployee(1, "Leo", "social security number #1", 50, 200);
        Employee emp_2 = new SalariedEmployee(2, "M-Jey", "social security number #2", 40, 150);
        Employee emp_3 = new ContractEmployee(3, "Doni", "federal tax id member #3", 8000);
        Employee emp_4 = new ContractEmployee(4, "Rafa", "federal tax id member #4", 10000);


        Employee employees[] = {emp_1, emp_2, emp_3, emp_4};
        System.out.println("before sorting: ");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        // when we use Comparator's method comparing with lambda function
        Comparator<Employee> comparingEmployeeWage = Comparator.comparingInt(e -> ((ICalculate) e).calculatePay());
        Arrays.sort(employees, comparingEmployeeWage);

        // when we use class EmployeeWageComparator which implements Comparator
        //Arrays.sort(employees, new EmployeeWageComparator());

        System.out.println();
        System.out.println("after sorting ASC: ");

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        System.out.println();
        System.out.println("after sorting DESC: ");
        Arrays.sort(employees, (e1, e2)-> ((ICalculate)e2).calculatePay() - ((ICalculate)e1).calculatePay());

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
