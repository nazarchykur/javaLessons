package com.company.homework_12.task_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        1) In the main() method declare map employeeMap
//        of pairs <Integer, String>.
        Map<Integer, String> employeeMap = new HashMap<>();

//        2)Add to employeeMap seven pairs (ID, name) of
//        some persons. Display the map on the screen.
        employeeMap.put(1, "Ivan");
        employeeMap.put(2, "John");
        employeeMap.put(3, "Done");
        employeeMap.put(4, "Leo");
        employeeMap.put(5, "Rafa");
        employeeMap.put(6, "Mike");
        employeeMap.put(7, "Jack");


////        2.1) 1 way
//        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//        }
//        System.out.println("-------------------------------------------");
////        2.2) 2 way
//        Iterator<Map.Entry<Integer, String>> entries = employeeMap.entrySet().iterator();
//        while (entries.hasNext()) {
//            Map.Entry<Integer, String> entry = entries.next();
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//        }
//        System.out.println("-------------------------------------------");
//
////        2.3) 3 way
//        Set<Integer> keys = employeeMap.keySet();
//        for (Integer key : keys) {
//            System.out.println("Key = " + key + ", Value = " + employeeMap.get(key));
//        }
//        2.4) 4 way
//        for (Integer key : employeeMap.keySet()) {
//            System.out.println("Key = " + key + ", Value = " + employeeMap.get(key));
//        }
//
//        System.out.println();
////        3) Ask user to enter ID, then find and write corresponding name from your map. If you can't
////        find this ID - say about it to user (use function containsKey()).
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter ID user :");
//        int id = scanner.nextInt();
//        System.out.println("Is the ID " + id + " present? " + employeeMap.containsKey(id));
//        if (employeeMap.containsKey(id)) {
//            System.out.println("Name by ID " + id + " is : " + employeeMap.get(id));
//        }

//        4) Ask user to enter name, verify than you have
//        name in your map and write corresponding ID. If
//        you can't find this name - say about it to user
//        (use function containsValue()).
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter name :");
        String name = sc.nextLine().trim().toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("Is the name " + name + " present? " + employeeMap.containsValue(name));

        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("Id by name " + name + " is : " + entry.getKey());
                }
            }
        }


    }
}
