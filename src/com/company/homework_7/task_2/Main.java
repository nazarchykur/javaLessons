package com.company.homework_7.task_2;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John");
        Student student2 = new Student("Olya");
        Teacher teacher1 = new Teacher("Hanna", 5000);
        Teacher teacher2 = new Teacher("Max", 4000);
        Cleaner cleaner1 = new Cleaner("Ira", 3000);
        Cleaner cleaner2 = new Cleaner("Margarita", 2000);

        Person[] people = {teacher1, cleaner1, student1, teacher2, cleaner2, student2};

        for (Person person: people ) {
            person.print();

            if(person instanceof Teacher || person instanceof Cleaner){
                ((Staff) person).salary();
            }
        }



    }
}
