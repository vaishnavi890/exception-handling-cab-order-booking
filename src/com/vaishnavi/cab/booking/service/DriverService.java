package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Driver;
import com.vaishnavi.cab.booking.utility.CabException;
import java.util.ArrayList;
import java.util.List;

public class DriverService {
    private final List<Driver> drivers = new ArrayList<>();

    public void registerDriver(Driver driver) throws CabException {
        if (driver.name.isEmpty() || driver.email.isEmpty() || driver.phone.isEmpty()) {
            throw new CabException("Driver details cannot be empty!");
        }
        drivers.add(driver);
        System.out.println("Driver registered successfully.");
    }

    public void displayDrivers() {
        for (Driver driver : drivers) {
            driver.displayDriver();
        }
    }
}

