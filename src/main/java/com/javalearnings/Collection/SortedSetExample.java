package com.javalearnings.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {

        SortedSet<Integer> sortedSet = new TreeSet<>();


        sortedSet.add(10);
        sortedSet.add(30);
        sortedSet.add(20);


        System.out.println("Elements of the SortedSet:");
        for (Integer num : sortedSet) {
            System.out.println(num);
        }


        System.out.println("First element: " + sortedSet.first());


        System.out.println("Last element: " + sortedSet.last());


        SortedSet<Integer> subset = sortedSet.headSet(25);
        System.out.println("Subset less than 25: " + subset);

        SortedSet<Integer> tail = sortedSet.tailSet(25);


        System.out.println("tail greater than 25: " + tail);
    }
}