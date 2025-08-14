package com.demo.day8;

public class WalletApplication {

    private Double balance;

    public WalletApplication() {
    }

    public WalletApplication(Double balance) {
        this.balance = balance;
    }

    public Double withdraw(Double amount) throws WalletWithdrawException, WalletValidationException {
        if(amount < 1){
            throw new WalletValidationException("Amount should be positive and not zero.");
        }
        if(amount <= this.balance){
            //
            this.balance-=amount;
        }
        else {
            // do exception handling
            throw new WalletWithdrawException("Insufficent balance, current balance:"+this.balance);
        }
        return this.balance;
    }
}
