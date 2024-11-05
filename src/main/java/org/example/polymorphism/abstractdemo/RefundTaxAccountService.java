package org.example.polymorphism.abstractdemo;

public interface RefundTaxAccountService extends AccountService{


    Account createAccount(String itrtax,String pan);
}
