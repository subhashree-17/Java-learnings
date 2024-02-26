package com.javalearnings.Collection;
import java.util.LinkedList;

public class TrainLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> train = new LinkedList<>();
        train.add("Alice");
        train.add("Bob");
        train.add("Charlie");


        train.add(2, "David");
        train.add(4, "Tim");

        train.remove("Bob");


        System.out.println("Passengers on board: " + train);


        System.out.println("Front passenger: " + train.getFirst());
        System.out.println("Last passenger: " + train.getLast());
    }

}