package com.company.homework_10.task_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        boolean success = false;
//        while (!success) {
//            try {
//                System.out.print("Enter side 'a' of the rectangle : ");
//                int a = scanner.nextInt();
//                System.out.println("side 'a' of the rectangle = " + a);
//                System.out.println("Enter side 'b' of the rectangle : ");
//                int b = scanner.nextInt();
//                System.out.println("side 'b' of the rectangle = " + b);
//
//                Rectangle.squareRectangle(a,b);
//
//                success = true;
//            } catch (InputMismatchException e) {
//                scanner.next();
//                System.out.println("You have entered invalid data");
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 'a' of the rectangle : ");
        int a = scanner.nextInt();

        System.out.print("Enter side 'b' of the rectangle : ");
        int b = scanner.nextInt();

        try {
            System.out.println("The square Rectangle is = " + Rectangle.squareRectangle(a,b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
