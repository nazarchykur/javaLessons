package com.company.homework_4;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("John", 1990);
        Person person2 = new Person("Melanie", 2015);
        Person person3 = new Person("Leo", 2000);
        Person person4 = new Person("Don", 1998);
        Person person5 = new Person("Rafa", 1980);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());
        System.out.println(person5.toString());

        person1.info();
        person2.info();
        person3.info();
        person4.info();
        person5.info();

        System.out.println("-----------------------------------------------------------");

        Employee emp1 = new Employee("Mike", 50, 40);
        Employee emp2 = new Employee("Thor", 80, 60);
        Employee emp3 = new Employee("Max", 100, 80);

        System.out.println(emp1.toString());
        System.out.println(emp1.salary());
        emp1.changeRate(100);

        System.out.println(emp1.toString());
        System.out.println(emp1.bonuses(50));
        System.out.println("Total hours is : " + (emp1.getHours()+ emp2.getHours() + emp3.getHours()));
    }
}
