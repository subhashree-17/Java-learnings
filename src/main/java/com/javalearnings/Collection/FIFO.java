package com.javalearnings.Collection;
import java.util.PriorityQueue;

public class FIFO {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();


        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);

        System.out.println("PriorityQueue: " + pq);
        //System.out.println("PriorityQueue before removal: " + pq);
        // pq.remove(15);


        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
            //  System.out.println("PriorityQueue After removal: " + pq);
        }
    }
}


