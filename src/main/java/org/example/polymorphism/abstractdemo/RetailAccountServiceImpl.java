package org.example.polymorphism.abstractdemo;

import java.util.UUID;

public class RetailAccountServiceImpl implements RetailAccountService{
    @Override
    public Account createAccount(String adhar, String pan) {

        Account account = new Account();
        account.setAccount(UUID.randomUUID().toString());
        account.setBalance(10000.0);
        account.setAdhar(adhar);
        account.setPan(pan);
        SBIAccountDBService.accountMap.put(account.getAccount(),account);

        return account;



    }
}
