package com.demo.day4;

public  class FordEmployee {

    private  Double basicSalary=0.0;

    public FordEmployee() {
        super();
    }

    public FordEmployee(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public  Double calculateSlary() {
        return this.basicSalary;
    }
}
