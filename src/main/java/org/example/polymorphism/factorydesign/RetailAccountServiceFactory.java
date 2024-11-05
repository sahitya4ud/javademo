package org.example.polymorphism.factorydesign;

import org.example.polymorphism.abstractdemo.AccountService;
import org.example.polymorphism.abstractdemo.RetailAccountServiceImpl;

public class RetailAccountServiceFactory implements AccountFactory{
    @Override
    public AccountService createAccount() {
        return new RetailAccountServiceImpl();
    }
}
