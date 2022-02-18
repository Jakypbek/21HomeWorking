package com.company;

import com.company.products.Fish;
import com.company.products.Milk;

public class ShowCase extends Store {

    private Product[] products = new Product[20];

    public ShowCase() {
    }

    public ShowCase(Product[] products) {
        this.products = products;
    }

    public void showAll() {
        for (int i = 0; i < 20; i++) {
            System.out.println(products[i]);
        }

    }

    public void apartment() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof Milk) {
                products[i].setLiveDays(((Milk) products[i]).getLiveDays() / 2);
            } else if (products[i] instanceof Fish) {
                products[i].setLiveDays(((Fish) products[i]).getLiveDays() / 6);
            }
        }

    }
}
