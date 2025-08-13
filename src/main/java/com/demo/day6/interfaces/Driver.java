package com.demo.day6.interfaces;

public class Driver {
    public static void main(String [] args){

        System.out.println(Parent.NAME);
        System.out.println(Parent.DATA);
        Parent.info();
        Child child = new Child();
        //c.info(); //Static method may only be called on its containing interface
        Parent.info();
        child.function();
        Sibling sibling = new Sibling();
        sibling.display();
        sibling.function();
        Parent.info();
        //Parent.data=2026;// Cannot assign a value to final variable 'data'
    }
}
