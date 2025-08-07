package com.demo.day4;

public class FordEmployee {

    private Double basicSalary;

    public FordEmployee() {
        super();
    }

    public FordEmployee(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double calculateSlary() {
        return this.basicSalary;
    }
}
