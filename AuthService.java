package com.zomata.app4;

// File: AuthService.java
public class AuthService {
    public boolean authenticate(AmazonUser user, String password) {
        return user != null && user.verifyPassword(password);
    }
}