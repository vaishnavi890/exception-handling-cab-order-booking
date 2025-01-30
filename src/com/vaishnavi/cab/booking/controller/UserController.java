package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.User;
import com.vaishnavi.cab.booking.service.UserService;
import com.vaishnavi.cab.booking.utility.CabException;


public class UserController {
    private final UserService userService = new UserService();

    public void registerUser(int id, String name, String email, String phone) {
        try {
            User user = new User(id, name, email, phone);
            userService.registerUser(user);
        } catch (CabException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("User registration attempt completed.");
        }
    }

    public void displayUsers() {
        userService.displayUsers();
    }
}

