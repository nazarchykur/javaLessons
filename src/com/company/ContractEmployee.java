package com.company;

public class ContractEmployee extends Employee implements ICalculate {
    private String federalTaxIdmember;
    private int fixedMonthlyPayment;

    public ContractEmployee(int employeeld, String name, String federalTaxIdmember, int fixedMonthlyPayment) {
        super(employeeld, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        //System.out.println("the average monthly salary for ContractEmployee = " + getFixedMonthlyPayment());
        return getFixedMonthlyPayment();
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                " employeeld = " + employeeId +
                ", name = '" + name + '\'' +
                ", the average monthly salary = " + calculatePay() +
                '}';
    }
}
