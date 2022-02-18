package com.company;

import java.time.LocalDate;
import java.util.Random;

public class Product {

    Random random = new Random();

    private Product[] products;

    private String name;
    private int expirationDate;
    private int liveDays;
    private LocalDate producedOn;
    private boolean isFresh;

    public Product() {
    }

    public Product(String name, int expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.liveDays = expirationDate;
        this.producedOn = LocalDate.now().minusDays(random.nextInt(200));
        isFresh();
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product getRandomProducts() {
        return products[random.nextInt(5)];
    }

    public void setLiveDays(int liveDays) {
        this.liveDays = liveDays;
    }

    public int getLiveDays() {
        return liveDays;
    }

    public void isFresh() {
        if (producedOn.plusDays(200).isAfter(LocalDate.now())) {
            this.isFresh = true;
        } else {
            this.isFresh = false;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", expirationDate=" + expirationDate +
                ", liveDays=" + liveDays +
                ", producedOn=" + producedOn +
                ", isFresh=" + isFresh +
                '}';
    }
}
