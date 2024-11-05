package org.example.polymorphism.factorydesign;

import org.example.polymorphism.abstractdemo.AccountService;
import org.example.polymorphism.abstractdemo.CorporateAccountServiceImpl;

public class CorporateAccountServiceFactory implements AccountFactory{


    @Override
    public AccountService createAccount() {
        return new CorporateAccountServiceImpl();
    }
}
