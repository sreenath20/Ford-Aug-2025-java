package com.demo.day9_collections;

import java.util.Comparator;
// Comparator is used to implement custom sorting logic

public class ProductNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
