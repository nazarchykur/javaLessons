package com.company;

import java.util.Comparator;

public class EmployeeWageComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {

        if ( ((ICalculate)e1).calculatePay() != ((ICalculate)e2).calculatePay() )
            return Integer.compare(((ICalculate)e1).calculatePay(), ((ICalculate)e2).calculatePay());
        else
            return e1.getName().compareTo(e2.getName());
    }


}
