package com.javalearnings.Collection;
import java.util.ArrayList;

import java.util.ArrayList;

public class Dressingshop {
    public static void main(String[] args) {
        ArrayList<String> Dresssingshop = new ArrayList<>();


        Dresssingshop.add("tshirt");
        Dresssingshop.add("croptop");
        Dresssingshop.add("chudi");


        if (Dresssingshop.size() > 1) {
            System.out.println("Item at position 1: " + Dresssingshop.get(1));
        } else {
            System.out.println("The Dressing list is empty or does not have an item at position 1.");
        }


        if (Dresssingshop.contains("croptop")) {
            Dresssingshop.remove("croptop");
            System.out.println("Item 'croptop' removed from the Dressing list.");
        } else {
            System.out.println("Item 'Bread' not found in the Dressing list.");
        }

        Dresssingshop.add("chudi");
        System.out.println("Updated Dressing List: " + Dresssingshop);

    }
}

