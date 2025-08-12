package com.demo.day6;

import java.util.Scanner;

public class Driver {
    public static void main(String args[]) {
        // encapsulation
        // inheritance
        // abstract class and interface
        // polymorphism
        // a. static polymorphism
        // b. dynamic polymorphism
        // i. Inheritance
        // ii. Parent reference can refer to any child objects

        // a. static polymorphism
        Calculator calculator = new Calculator();
        calculator.display();
        calculator.display(500);
        calculator.display(50.55);
        calculator.display(75.5, 100);
        calculator.display(75, "Ford");
        calculator.display(calculator);
        // b. dynamic polymorphism
        Parent parent = new Parent();
        Child child = new Child();
        Parent objectRef;
        objectRef = parent;
        objectRef.display();
        objectRef = child;
        objectRef.display();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input choice: 1. Parent 2. Child");
        Integer option = scanner.nextInt();
        if (option == 1) {
            objectRef = parent;
        } else {
            objectRef = child;
        }
        objectRef.display();


    }
}
