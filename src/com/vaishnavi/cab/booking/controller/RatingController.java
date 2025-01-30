package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Rating;
import com.vaishnavi.cab.booking.service.RatingService;
import com.vaishnavi.cab.booking.utility.CabException;

public class RatingController {
    private final RatingService ratingService = new RatingService();

    public void submitRating(int ratingId, int rideId, int userId, int driverId, int rating, String review) {
        try {
            Rating ratingObj = new Rating(ratingId, rideId, userId, driverId, rating, review);
            ratingService.submitRating(ratingObj);
        } catch (CabException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Rating submission attempt completed.");
        }
    }

    public void displayRatings() {
        ratingService.displayRatings();
    }
}

