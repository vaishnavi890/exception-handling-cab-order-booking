package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.User;
import com.vaishnavi.cab.booking.utility.CabException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    public void registerUser(User user) throws CabException {
        if (user.name.isEmpty() || user.email.isEmpty() || user.phone.isEmpty()) {
            throw new CabException("User details cannot be empty!");
        }
        users.add(user);
        System.out.println("User registered successfully.");
    }

    public void displayUsers() {
        for (User user : users) {
            user.displayUser();
        }
    }
}
