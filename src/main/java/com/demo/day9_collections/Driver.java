package com.demo.day9_collections;

import java.util.*;

import static java.util.Arrays.*;

public class Driver {
    public static void main(String[] args) {

        // CRUD operations
        // C. Create
        // R. Read
        // U. Update
        // D. Delete

        // List => ArrayList()
        // 1. ordered
        // 2. not sorted
        // 3. Has duplicate

        // Create
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("C");
        stringList.add("B");
        stringList.add("B");
        System.out.println(stringList);
// Read
        System.out.println("at index 0" + stringList.get(0));
        System.out.println("at index 2" + stringList.get(2));

        stringList.add(3, "E"); // insert operation
        System.out.println(stringList);

        // Update
        String previous = stringList.set(0, "a");

        System.out.println(stringList);
        System.out.println("Previous ?" + previous);
// Delete
        stringList.remove(2);
        System.out.println(stringList);
        stringList.add("E");
        System.out.println(stringList);
        stringList.remove("E");
        System.out.println(stringList);
        // sort
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(3);
        numbers.add(1);
        System.out.println(numbers);
        //numbers.sort();// needs comparator
        Collections.sort(numbers);
        System.out.println("Sorted int vlues" + numbers);
// List Product
// Create
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(9, "Dell Laptop", 55000.0));
        productList.add(new Product(10, "Mac Laptop", 22000.0));
        productList.add(new Product(1, "Win Laptop", 33000.0));

        System.out.println(productList);
        // Read
        System.out.println(productList.get(1));
        // Update
        Product updateProduct = new Product(101, "Mac desktop", 99000.0);
        productList.set(1, updateProduct);
        System.out.println(productList);
        // delete
        productList.remove(updateProduct);
        System.out.println(productList);
        productList.remove(0);
        System.out.println(productList);
// Sort product list
        productList.clear();// delete all products
        productList.add(new Product(9, "Dell Laptop", 55000.0));
        productList.add(new Product(10, "Mac Laptop", 22000.0));
        productList.add(new Product(1, "Win Laptop", 33000.0));
        productList.add(new Product(5, "Win Laptop", 35000.0));
        System.out.println("Unsorted products:" + productList);
        Collections.sort(productList);
        System.out.println("Sorted products by id:" + productList);
        // sort based on product name
        productList.sort(new ProductNameComparator());
        System.out.println("Sorted products by name:" + productList);
        // sort based on product price
        productList.sort(new ProductPriceComparator());
        System.out.println("Sorted products by price:" + productList);

        Collections.sort(productList, new ProductNameComparator());
        System.out.println("Using Collections Sorted products by name:" + productList);
// search a string
        System.out.println(stringList);
        System.out.println("Check for D ?" + stringList.indexOf("D"));
        System.out.println("Check for B ?" + stringList.indexOf("B"));
        // in java for wrapper types to check equality
        String one = "100";// string literal
        String two = new String("100"); //"100";
        if (one == two) { // it will check for equality of address of objects
            System.out.println("Equal");
        } else
            System.out.println("not equal");
        //  to check values
        if (one.equals(two))
            System.out.println("E");
        else
            System.out.println("N E");

// search for product having id 9
        Product productOne = new Product(55, "product 55", 55000.0);
        Product productTwo = productOne;
        Product productThree = new Product(55, "product 55", 55000.0);

        if (productOne.equals(productThree))
            System.out.println("same products");
        else System.out.println("Not same products");
        // to implement equality hten we have to override hashcode and equals method
        System.out.println("Product list: "+ productList);
        Product serachProduct =  new Product(10, "Mac Laptop",22000.0);
        System.out.println("product id 10 exists : "+ productList.indexOf(serachProduct));

    }
}
