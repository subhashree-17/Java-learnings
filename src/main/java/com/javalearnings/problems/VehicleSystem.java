package com.javalearnings.problems;

public class VehicleSystem {
    public static void main(String[] args) {
        
        Vehicle car = new Car("Toyota", "Camry", 2022, 4);
        Vehicle motorcycle = new Motorcycle("Honda", "CBR600RR", 2021, "Sport");

        
        car.displayInfo();
        motorcycle.displayInfo();
    }
}
