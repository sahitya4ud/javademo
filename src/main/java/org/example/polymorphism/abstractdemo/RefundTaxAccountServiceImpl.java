package org.example.polymorphism.abstractdemo;

import java.util.UUID;

public class RefundTaxAccountServiceImpl implements RefundTaxAccountService {
    @Override
    public Account createAccount(String itrtax, String pan) {

        Account account= new Account();
        account.setAccount(UUID.randomUUID().toString());
        account.setBalance(1000000.0);
        SBIAccountDBService.accountMap.put(account.getAccount(),account);
        return account;
    }
}
