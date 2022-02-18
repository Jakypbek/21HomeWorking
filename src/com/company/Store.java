package com.company;

import java.util.Random;

public class Store {

    Random random = new Random();

    private Product[] products = new Product[20];
    private Product[] productsInIce = new Product[20];
    private Product[] productsInShow = new Product[20];

    public Product[] getProductsInShow() {
        return productsInShow;
    }

    public Store() {
    }

    public Store(Product products) {
        for (int i = 0; i < 20; i++) {
            this.products[i] = products.getRandomProducts();
        }
    }

    public void placeProducts() {
        int c = 0;
        for (int i = 0; i < 20; i++) {
            if (random.nextInt(2) % 2 == 0) {
                productsInIce[i] = products[random.nextInt(19)];
            } else {
                productsInShow[c] = products[random.nextInt(19)];
                c++;
            }
        }
        ShowCase showCase = new ShowCase(productsInShow);
        IceBox iceBox = new IceBox(productsInIce);
        showCase.apartment();
    }








}
