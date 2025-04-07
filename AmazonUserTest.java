package com.zomata.app4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AmazonUserTest {
    @Test
    public void testVerifyPasswordCorrect() {
        AmazonUser user = new AmazonUser("user@example.com", "securePass");
        assertTrue(user.verifyPassword("securePass"));
    }

    @Test
    public void testVerifyPasswordIncorrect() {
        AmazonUser user = new AmazonUser("user@example.com", "securePass");
        assertFalse(user.verifyPassword("wrongPass"));
    }
}
