package com.demo.day6.interfaces;

public class Child implements Parent {
    @Override
    public void display() {
        System.out.println("Display name" + Parent.NAME);
        System.out.println("Display data" + Parent.DATA);
    }

    public void function() {
        System.out.println("Child function");
    }

}
