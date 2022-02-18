package com.company.products;

import com.company.Product;

import java.time.LocalDate;

public class Stew extends Product {

    public Stew() {
    }

    public Stew(String name, int expirationDate) {
        super(name, expirationDate);
    }
}
