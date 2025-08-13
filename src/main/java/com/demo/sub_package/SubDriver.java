package com.demo.sub_package;
import com.demo.day7.Parent;


public class SubDriver {
    public static void main(String args[]) { // method level modifier
        Parent parent = new Parent();
        parent.name="Ford India";
        //'password' has private access in 'com.demo.day7.Parent'
        //parent.password = "123";
        //'city' is not public in 'com.demo.day7.Parent'. Cannot be accessed from outside package
       //parent.city = "Delhi";
        // 'address' has protected access in 'com.demo.day7.Parent'
       //parent.address = "USA";


    }
}
