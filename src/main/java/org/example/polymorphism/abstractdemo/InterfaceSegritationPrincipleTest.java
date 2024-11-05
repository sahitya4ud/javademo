package org.example.polymorphism.abstractdemo;

public class InterfaceSegritationPrincipleTest implements AccountService {

    @Override
    public Account createAccountRetail(String adhar, String pan) {
        return null;
    }

    @Override
    public Account createAccountCorporate(String gst, String pan) {
        return null;
    }
}
