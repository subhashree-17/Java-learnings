package com.javalearnings.problems;

public class VehicleRentalSystem {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("ABC123", "Car");
        Vehicle vehicle2 = new Vehicle("XYZ456", "Bike");


        Customer customer1 = new Customer("C001", "John Doe");
        Customer customer2 = new Customer("C002", "Jane Smith");


        RentalTransaction rentalTransaction1 = new RentalTransaction(customer1, vehicle1, "2024-03-22", "2024-03-25");
        RentalTransaction rentalTransaction2 = new RentalTransaction(customer2, vehicle2, "2024-03-23", "2024-03-27");


        System.out.println(rentalTransaction1);
        System.out.println(rentalTransaction2);


        vehicle1.setRented(true);
        vehicle2.setRented(true);


        System.out.println("Vehicle 1 rented: " + vehicle1.isRented());
        System.out.println("Vehicle 2 rented: " + vehicle2.isRented());
    }

}
