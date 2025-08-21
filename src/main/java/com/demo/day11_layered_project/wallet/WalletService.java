package com.demo.day11_layered_project.wallet;

import com.demo.day9_generics.Box;

import java.util.Collection;
import java.util.Collections;

public interface WalletService {

    Wallet registerNewUserWallet(Wallet newWallet) throws WalletException;

    Double addFundsToWalletByEmailId(String emailId, Double amount) throws WalletException;

    Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletWithdrawException;

    Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException;

    Wallet getUserWalletByEmailId(String userEmailId) throws WalletException;

    Collection<Wallet> getAllCustomerWallets() throws WalletException;
}
