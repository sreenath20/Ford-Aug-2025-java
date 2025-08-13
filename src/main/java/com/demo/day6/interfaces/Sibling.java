package com.demo.day6.interfaces;

public class Sibling implements Parent{
    @Override
    public void display() {
        Integer defaultData = Parent.DATA;
        defaultData++;
        System.out.println("Sibling"+ Parent.DATA);
    }
}
