package org.example.polymorphism.factorydesign;

import org.example.polymorphism.abstractdemo.AccountService;

public interface AccountFactory {

    AccountService createAccount();

}
