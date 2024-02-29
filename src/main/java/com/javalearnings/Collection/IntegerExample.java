package com.javalearnings.Collection;
import java.util.LinkedHashSet;
public class IntegerExample {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();


        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);


        linkedHashSet.add(10);


        System.out.println("Elements of the LinkedHashSet:");
        for (Integer num : linkedHashSet) {
            System.out.println(num);
        }


        System.out.println("Contains 20? " + linkedHashSet.contains(20));


        linkedHashSet.remove(30);


        System.out.println("LinkedHashSet after removing 30: " + linkedHashSet);
    }

}
