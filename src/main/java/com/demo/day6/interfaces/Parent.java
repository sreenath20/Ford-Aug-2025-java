package com.demo.day6.interfaces;

public interface Parent {
    // add data members inside interface to shre with all implementors
    public final static  String NAME = "ford";
     Integer DATA = 2025;
    public abstract void display(); // contract
    // static methods
    static void info(){ // utility method
        System.out.println("info about my interface :"+ NAME);
    }
    // default methods
    default void function(){
        System.out.println("Default function");
    }

}
