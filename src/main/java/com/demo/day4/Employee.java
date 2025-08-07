package com.demo.day4;

public class Employee { // POJO plain Old Java Object
    // data members
   private String name;
   private String email;
   private String id;

    public Employee() { // default constructor
    }

    // parameterised constructor
    public Employee(String name, String email, String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.name + '\'' +
                ", email='" + this.email + '\'' +
                ", id='" + this.id + '\'' +
                '}';
    }
}
