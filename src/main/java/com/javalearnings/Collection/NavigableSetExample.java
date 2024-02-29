package com.javalearnings.Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {

        NavigableSet<Integer> navigableSet = new TreeSet<>();


        navigableSet.add(10);
        navigableSet.add(20);
        navigableSet.add(30);
        navigableSet.add(40);
        navigableSet.add(50);

        System.out.println("NavigableSet: " + navigableSet);


        System.out.println("Ceiling of 25: " + navigableSet.ceiling(25));


        System.out.println("Floor of 25: " + navigableSet.floor(25));


        System.out.println("First element: " + navigableSet.pollFirst());
        System.out.println("NavigableSet after removing first element: " + navigableSet);


        System.out.println("Last element: " + navigableSet.pollLast());
        System.out.println("NavigableSet after removing last element: " + navigableSet);
    }
}