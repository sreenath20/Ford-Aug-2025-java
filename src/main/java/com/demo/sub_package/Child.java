package com.demo.sub_package;

import com.demo.day7.Parent;

public class Child extends Parent {

    void display() {
        super.name = "Ford India";
        //super.password= "123";
        //super.city = "Delhi";
        super.address = "USA";
    }
}
