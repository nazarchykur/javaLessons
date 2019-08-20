package com.company.homework_12.task_1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>();


        for (int i = 0; i<10; i++) {

            myCollection.add(i + ((int)(Math.random() * 10 )));
        }

//        myCollection.add(8);
//        myCollection.add(1);
//        myCollection.add(6);
//        myCollection.add(17);
//        myCollection.add(8);
//        myCollection.add(21);
//        myCollection.add(16);
//        myCollection.add(5);
//        myCollection.add(3);
//        myCollection.add(28);

//        1)
//        Find and save in list newCollection all positions of
//        element more than 5 in the collection. Print newCollection

        List<Integer> newCollection = myCollection.stream().skip(5).collect(Collectors.toList());
        newCollection.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");
        System.out.println();

//          collect el (x>20) in new List
        List<Integer> listElementGreater20 = myCollection.stream().filter(x -> (x > 20)).collect(Collectors.toList());
        listElementGreater20.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");
        System.out.println();
//        2)
//        Remove from collection myCollection elements, which
//        are greater then 20. Print result

        //new LinkedList<>(myCollection);

        // convert list to LinkedList for faster deleting elements
        myCollection.stream().collect(Collectors.toCollection(LinkedList::new));
        myCollection.removeIf(x -> (x > 20));
        myCollection.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");
        System.out.println();
//       3)
//        Insert elements 1, -3, -4 in positions 2, 8, 5. Print result
//        in the format: “position – xxx, value of element – xxx”
        myCollection.add(2,1);
        myCollection.add(8,-3);
        myCollection.add(5,-4);

        for (int i = 0; i < myCollection.toArray().length; i++) {
            System.out.println("position – " + i + ", value of element – " + myCollection.toArray()[i]);
        }
    }
}
