package com.demo.day6;

public class Calculator {
    // Overloading methods  = static polymorphism
    // rules to make different signatures
    // 1. by type
    // 2. number of parameters
    // 3. order of parameters
    public void display() {
        System.out.println("Calculator display.");
    }

    public void display(Integer data) {
        System.out.println("Integer :" + data);
    }

    public void display(Double data) {
        System.out.println("Double :" + data);
    }

    public void display(Double data, Integer number) {
        System.out.println("Double :" + data + " Integer:" + number);
    }

    public void display(Integer number, Double data) {
        System.out.println("Integer :" + number + " Double :" + data);
    }

    public void display(Integer number, String name) {
        System.out.println("Integer :" + number + " String :" + name);

    }

    public void display(Calculator calculator) {
        System.out.println("Calculator object !");

    }
}
