package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Ride;
import com.vaishnavi.cab.booking.service.RideService;
import com.vaishnavi.cab.booking.utility.CabException;

public class RideController {
    private final RideService rideService = new RideService();

    public void bookRide(int rideId, int userId, int driverId, String pickup, String dropoff, double fare, String status) {
        try {
            Ride ride = new Ride(rideId, userId, driverId, pickup, dropoff, fare, status);
            rideService.bookRide(ride);
        } catch (CabException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Ride booking attempt completed.");
        }
    }

    public void updateRideStatus(int rideId, String newStatus) {
        try {
            rideService.updateRideStatus(rideId, newStatus);
        } catch (CabException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Ride status update attempt completed.");
        }
    }

    public void displayRides() {
        rideService.displayRides();
    }
}
