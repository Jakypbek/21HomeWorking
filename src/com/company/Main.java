package com.company;

import com.company.products.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Product product = new Product();

        product.setProducts(new Product[]{
                new Milk("Молоко", 60),
                new Corn("Кукуруза", 150),
                new Stew("Тушенка", 180),
                new Salt("Соль", 100000000),
                new Fish("Рыба", 20),
        });

        Store store = new Store(product);

        store.placeProducts();

        for (Product val : store.getProductsInShow()) {
            System.out.println(val);
        }








    }
}
