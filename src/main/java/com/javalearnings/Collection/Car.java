package com.javalearnings.Collection;
import java.util.Vector;
public class Car {
    public static void main(String[] args) {
        Vector<String> Caritems = new Vector<>();


        Caritems.add("Supra");
        Caritems.add("Mercedes");
        Caritems.add("Jaguar");


        System.out.println("I love: " + Caritems);


        Caritems.remove("Supra");


        System.out.println("You love: " + Caritems);
        System.out.println("I love: " + Caritems);
    }

}
