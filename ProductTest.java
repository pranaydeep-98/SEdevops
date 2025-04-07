package com.zomata.app4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void testGetProductInfo() {
        Product product = new Product("Laptop", 999.99);
        assertEquals("Laptop costs $999.99", product.getProductInfo());
    }
}