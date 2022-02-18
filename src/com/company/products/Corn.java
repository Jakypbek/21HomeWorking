package com.company.products;

import com.company.Product;

import java.time.LocalDate;

public class Corn extends Product {

    public Corn() {
    }

    public Corn(String name, int expirationDate) {
        super(name, expirationDate);
    }
}
