package com.vaishnavi.cab.booking.model;

public class User {
    protected int userId;
    public String name;
    public String email;
    public String phone;

    public User(int userId, String name, String email, String phone) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void displayUser() {
        System.out.println("User ID: " + userId + ", Name: " + name + ", Email: " + email + ", Phone: " + phone);
    }
}
