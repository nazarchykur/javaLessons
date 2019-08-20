package com.company.homework_10.task_2;

public class Main {
    public static void main(String[] args) {
        Plants plants1 = null;
        try {
            plants1 = new Plants(50, "green", "square");
        } catch (ColorException e) {
            e.printStackTrace();
        } catch (TypeException e) {
            e.printStackTrace();
        }
        System.out.println(plants1);

    }
}
