package com.demo.day4;

public class Child extends Parent{

    // data members of child
    Integer data=50;
    public Child() {
        super();
    }
    public void display(){
        System.out.println("Child display data"+this.data);
        System.out.println("Child display parent data "+super.data);
        super.display();
    }
    public void info(){
        System.out.println("Child info");
}

}
