package com.javalearnings.problems;


abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    public abstract void displayInfo();


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


class Car extends Vehicle {
    private int doors;

    public Car(String make, String model, int year, int doors) {
        super(make, model, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + getMake() + " " + getModel() + " (" + getYear() + ") - " + doors + " doors");
    }
}


class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle: " + getMake() + " " + getModel() + " (" + getYear() + ") - Type: " + type);
    }
}

