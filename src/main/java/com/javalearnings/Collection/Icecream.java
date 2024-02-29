package com.javalearnings.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class Icecream {
    private static String[] args;

    public static void main (String args[]) {


        HashSet<String> set = new HashSet<>();

        set.add("Chocolate");
        set.add("Redvelvet");
        set.add("Oreo");

        set.add("Straberry");

        System.out.println("Elements in HasHSet");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Contains 'Redvelvet' ?" + set.contains("Redvelvet"));

        set.remove("Oreo");

        System.out.println("HashSet after removing 'Oreo': " + set);


    }

}
