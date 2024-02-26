package com.javalearnings.Collection;
import java.util.Stack;

public class Platestack {
    public static void main(String[] args) {
        Stack<String> plateStack = new Stack<>();

        plateStack.push("Plate 1");
        plateStack.push("Plate 2");
        plateStack.push("Plate 3");


        plateStack.remove("Plate 1");

        plateStack.push("Plate 4");




        System.out.println("Remaining plates: " + plateStack);
    }

}
