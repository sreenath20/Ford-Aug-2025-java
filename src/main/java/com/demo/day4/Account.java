package com.demo.day4;

public class Account {
    private Integer id;
    private String name;
    private Double balance;

    public Account() {
    }

    public Account(Integer id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Double addFunds(Double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Deposit amount must be min 1");
        }
        return this.balance;
    }

    public Double withdrawFunds(Double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("You do not have sufficient balance.");
        }
        return this.balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
