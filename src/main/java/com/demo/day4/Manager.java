package com.demo.day4;

public class Manager extends FordEmployee{

    Double bonus;

    public Manager(Double basicSalary, Double bonus) {
        super(basicSalary);
        this.bonus = bonus;
    }

//    @Override
//    public Double calculateSlary() {
//        return super.calculateSlary() + this.bonus;
//    }
}
