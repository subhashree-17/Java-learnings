package com.javalearnings.problems;
import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleType;
    private boolean isRented;

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.isRented = false;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", isRented=" + isRented +
                '}';
    }
}


class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private String rentalStartDate;
    private String rentalEndDate;

    public RentalTransaction(Customer customer, Vehicle vehicle, String rentalStartDate, String rentalEndDate) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public String getRentalEndDate() {
        return rentalEndDate;
    }

    @Override
    public String toString() {
        return "RentalTransaction{" +
                "customer=" + customer +
                ", vehicle=" + vehicle +
                ", rentalStartDate='" + rentalStartDate + '\'' +
                ", rentalEndDate='" + rentalEndDate + '\'' +
                '}';
    }
}


