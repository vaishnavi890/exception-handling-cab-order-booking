package com.vaishnavi.cab.booking;

import com.vaishnavi.cab.booking.controller.UserController;
import com.vaishnavi.cab.booking.controller.DriverController;

public class CabBooking {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.registerUser(1, "Nikita", "Nikita@example.com", "1234567890");
        userController.registerUser(2, "Supriya", "", "9876543210"); // This should throw an exception

        System.out.println("\nRegistered Users:");
        userController.displayUsers();

        DriverController driverController = new DriverController();
        driverController.registerDriver(101, "Saurabh", "Saurabh@example.com", "1234567890", "Sedan - XYZ123");

        System.out.println("\nRegistered Drivers:");
        driverController.displayDrivers();
    }
}

