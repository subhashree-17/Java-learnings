package com.javalearnings.Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndings {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(3);
        deque.addLast(4);
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(0);
        deque.addLast(5);


        System.out.println("Deque: " + deque);

        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from back: " + deque.removeLast());



        System.out.println("Deque after removal: " + deque);


    }
}