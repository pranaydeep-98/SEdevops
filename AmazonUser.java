package com.zomata.app4;

public class AmazonUser {
    private String email;
    private String password;

    public AmazonUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}

