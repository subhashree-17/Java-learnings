package com.javalearnings.problems;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Buddy"));
        animals.add(new Cat("Whiskers"));

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says:");
            animal.makeSound();
        }
    }
}
