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
        return 0.0;
    }

    @Override
    public Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletWithdrawException {
        return 0.0;
    }

    @Override
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException {
        return null;
    }

    @Override
    public Wallet getUserWalletByEmailId(String userEmailId) throws WalletException {
        return this.userWalletsMap.get(userEmailId);
    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws WalletException {
        return this.userWalletsMap.values();
    }
}
