package com.company.products;

import com.company.Product;

import java.time.LocalDate;

public class Fish extends Product {

    public Fish() {
    }

    public Fish(String name, int expirationDate) {
        super(name, expirationDate);
    }
}
