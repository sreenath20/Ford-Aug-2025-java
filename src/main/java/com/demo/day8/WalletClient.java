package com.demo.day8;

public class WalletClient {
    public static void main(String[] args) {

        WalletApplication wallet = new WalletApplication(500.0);

        try {
            wallet.withdraw(600.0);

        } catch (WalletWithdrawException e) {
            //throw new RuntimeException(e); // rethrow
            System.out.println(e.getMessage());
        } catch (WalletValidationException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(" Amount Withdrawn successfully, Your balance :" + wallet.withdraw(501.0));

        } catch (WalletWithdrawException e) {
            System.out.println(e.getMessage());
        } catch (WalletValidationException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Thank you for using Wallet Application...");
    }
}
