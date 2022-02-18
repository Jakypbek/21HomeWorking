package com.company.products;

import com.company.Product;

import java.time.LocalDate;

public class Salt extends Product {

    public Salt() {
    }

    public Salt(String name, int expirationDate) {
        super(name, expirationDate);
    }
}
