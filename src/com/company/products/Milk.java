package com.company.products;

import com.company.Product;

import java.time.LocalDate;

public class Milk extends Product {

    public Milk() {
    }

    public Milk(String name, int expirationDate) {
        super(name, expirationDate);
    }

    @Override
    public String toString() {
        return "Milk{} " + super.toString();
    }
}
