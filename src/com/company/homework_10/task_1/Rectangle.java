package com.company.homework_10.task_1;

public class Rectangle {

    public static int squareRectangle(int a, int b) throws Exception {

        if (a < 0 | b < 0){
            throw new Exception();
        }
        return a * b;
    }
}
