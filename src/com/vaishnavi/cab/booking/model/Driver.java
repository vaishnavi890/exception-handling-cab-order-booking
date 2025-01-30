package com.vaishnavi.cab.booking.model;

public class Driver extends User{
    private final String cabDetails;

    public Driver(int driverId, String name, String email, String phone, String cabDetails) {
        super(driverId, name, email, phone);
        this.cabDetails = cabDetails;
    }

    public void displayDriver() {
        super.displayUser();
        System.out.println("Cab Details: " + cabDetails);
    }
}

