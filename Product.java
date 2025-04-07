package com.zomata.app4;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getProductInfo() {
        return name + " costs $" + price;
    }
}
