package com.javalearnings.problems;
import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // List
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        System.out.println("List: " + list);

        // Set
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Set: " + set);

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("Map: " + map);

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        System.out.println("Queue: " + queue);

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("bottom");
        stack.push("middle");
        stack.push("top");
        System.out.println("Stack: " + stack);

        // Deque
        Deque<String> deque = new LinkedList<>();
        deque.offerFirst("first");
        deque.offerLast("last");
        System.out.println("Deque: " + deque);
    }
}
