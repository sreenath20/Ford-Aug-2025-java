package com.demo.day4;

import java.util.Scanner;

public class Driver {

    public static void main(String [] args){

        Integer data = 100;
        Employee employee ;
        employee = new Employee();

        employee.setName("Ford");
        employee.setEmail("info@ford.com");
        employee.setId("Ford001");

        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getEmail());

        Employee employeeTwo = new Employee("name1","name@gmail.com","id01");

        System.out.println(employeeTwo.toString());
        System.out.println(employeeTwo);
        System.out.println(employee);
        Product product = new Product(1,"Dell Laptop",55000.0);
        System.out.println(product);

        Account account = new Account(55,"India",5000.0);
        System.out.println(account);

        Parent parent = new Parent();
        parent.display();
        Child child = new Child();
        child.display();
        child.info();
        GrandChild grandChild = new GrandChild();
        grandChild.display();
        grandChild.info();

        Parent parentRef ;
        parentRef = parent;
        parentRef.display();
        parentRef = child;
        parentRef.display();
        //parentRef.info();

        FordEmployee fordEmployee = new Manager(5000.0,500.0);
        System.out.println(fordEmployee.calculateSlary());
        FordEmployee fordEmployee1 = new FordEmployee(5000.0);
        fordEmployee1.calculateSlary();
        Scanner scanner = new Scanner(System.in);
    }
}
