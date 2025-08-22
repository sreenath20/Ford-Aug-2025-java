package com.demo.day11_layered_project.wallet;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalletServiceImpl implements WalletService {

    // Data structure emailId->Wallet

    private Map<String, Wallet> userWalletsMap = new HashMap<>();

    @Override
    public Wallet registerNewUserWallet(Wallet newWallet) throws WalletException {
        // exception handling if email id already exists
        if (this.userWalletsMap.containsKey(newWallet.getEmail())) {
            throw new WalletException("Email id already exists, please retry with new id:" + newWallet.getEmail());
        }
        this.userWalletsMap.put(newWallet.getEmail(), newWallet); // adding wallet to map
        return this.userWalletsMap.get(newWallet.getEmail()); // retrieve saved customer wallet
    }

    @Override
    public Double addFundsToWalletByEmailId(String emailId, Double amount) throws WalletException {
        // check if account exists
        if (!this.userWalletsMap.containsKey(emailId))
            throw new WalletException("Account does not exists for email:" + emailId);
        // do validation of data in controller layer [amount must be +ve and multiple of 100]
        Wallet foundWallet = this.userWalletsMap.get(emailId);
        foundWallet.setBalance(foundWallet.getBalance() + amount);
        return foundWallet.getBalance();
    }

    @Override
    public Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletWithdrawException {
        // check if  account  exist
        if (!this.userWalletsMap.containsKey(emailId))
            throw new WalletWithdrawException("Account does not exists for email:" + emailId);
        // check for sufficent balance
        Wallet foundWallet = this.userWalletsMap.get(emailId);
        if (foundWallet.getBalance() < amount)
            throw new WalletWithdrawException("Withdraw failed ! , Insufficient balance, re-try! current balance:" + foundWallet.getBalance());
        Double balance = foundWallet.getBalance();
        foundWallet.setBalance(balance - amount);
        return foundWallet.getBalance();
    }

    @Override
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException {
        // validate amount
        if (amount < 1)
            throw new WalletException("Transfer amount should be min 1Rs");
        // check if from & to account exist
        if (!this.userWalletsMap.containsKey(fromEmailId))
            throw new WalletException("From account does not exits:" + fromEmailId);
        if (!this.userWalletsMap.containsKey(toEmailId))
            throw new WalletException("To account does not exits:" + toEmailId);
        Wallet fromWallet = this.userWalletsMap.get(fromEmailId);
        Wallet toWallet = this.userWalletsMap.get(toEmailId);
        Double fromBalance = fromWallet.getBalance();
        if (fromBalance < amount)
            throw new WalletException("Transfer failed ! from account has Insufficient balance, current balance :" + fromBalance);
        //fund  transfer logic goes here
        fromWallet.setBalance(fromBalance - amount);
        toWallet.setBalance(toWallet.getBalance() + amount);
        return true;
    }

    @Override
    public Wallet getUserWalletByEmailId(String userEmailId) throws WalletException {
        return this.userWalletsMap.get(userEmailId);
    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws WalletException {
        return this.userWalletsMap.values();
    }

    @Override
    public Wallet userLogin(String userEmailId, String password) throws WalletException {
        return null;
    }

    @Override
    public Collection<Wallet> sortCustomerWallets(String order) throws WalletException {
        return List.of();
    }

    @Override
    public Collection<Wallet> findWalletsByName(String name) throws WalletException {
        return List.of();
    }

    @Override
    public Collection<Wallet> findAllWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException {
        return List.of();
    }

    @Override
    public Boolean updateWalletPassword(String emailId, String oldPassword, String newPassword) throws WalletException {
        return null;
    }
}
