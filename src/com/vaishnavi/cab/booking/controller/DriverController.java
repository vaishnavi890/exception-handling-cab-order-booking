package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.service.DriverService;
import com.vaishnavi.cab.booking.utility.CabException;

public class DriverController {
    private final DriverService driverService = new DriverService();

    public void registerDriver(int id, String name, String email, String phone, String cabDetails) {
        try {
            Driver driver = new Driver(id, name, email, phone, cabDetails);
            driverService.registerDriver(driver);
        } catch (CabException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Driver registration attempt completed.");
        }
    }

    public void displayDrivers() {
        driverService.displayDrivers();
    }
}

