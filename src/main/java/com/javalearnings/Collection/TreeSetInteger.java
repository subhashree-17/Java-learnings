package com.javalearnings.Collection;
import java.util.TreeSet;

public class TreeSetInteger {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();


        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);


        treeSet.add(10);


        System.out.println("Elements of the TreeSet:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }


        System.out.println("Contains 20? " + treeSet.contains(20));


        treeSet.remove(30);


        System.out.println("TreeSet after removing 30: " + treeSet);
    }

}
