package com.demo.day11_layered_project.wallet;

public class WalletController {
    public static void main(String[] args) {//throws WalletWithdrawException {

        WalletService walletService = new WalletServiceImpl();

        // Add new user
        Wallet wallet = new Wallet(1, "User 1", "name1@gmail.com", "123@name1", 500.0);
        try {
            System.out.println(walletService.registerNewUserWallet(wallet));
            System.out.println(walletService.registerNewUserWallet(new Wallet(2, "User 2", "name2@gmail.com", "123@name2", 600.0)));
            System.out.println(walletService.registerNewUserWallet(wallet));

        } catch (WalletException e) {
            //throw new RuntimeException(e); // rethrow
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("All users:" + walletService.getAllCustomerWallets());
        } catch (WalletException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        try {
            Double newBalance = walletService.addFundsToWalletByEmailId("name1@gmail.com", 75.0);
            System.out.println("Funds added, new balance :" + newBalance);
            System.out.println("All wallets:" + walletService.getAllCustomerWallets());
        } catch (WalletException e) {
            // throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        try {
            walletService.withdrawFromWalletByEmailId("name1@gmail.com", 600.0);
        } catch (WalletWithdrawException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }


        System.out.println("***** Thank you for using Online wallet papplication *****");
    }
}
