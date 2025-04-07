package com.zomata.app4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthServiceTest {
    @Test
    public void testAuthenticateSuccess() {
        AmazonUser user = new AmazonUser("admin@amazon.com", "admin123");
        AuthService auth = new AuthService();
        assertTrue(auth.authenticate(user, "admin123"));
    }

    @Test
    public void testAuthenticateFailure() {
        AmazonUser user = new AmazonUser("admin@amazon.com", "admin123");
        AuthService auth = new AuthService();
        assertFalse(auth.authenticate(user, "wrong123"));
    }
}