package com.demo.day4;

import java.util.Objects;

public class Parent extends Object{

     Integer data=100;

    public Parent() {
    }

    public void display(){
        System.out.println("Parent data="+data);
    }

    @Override
    public String toString() {
        return "Parent{" +
                "data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return Objects.equals(data, parent.data);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data);
    }

}
