package org.example.polymorphism.abstractdemo;

public class InterfaceSegritationPrincipleTest implements AccountService {


   public Account createAccountRetail(String adhar, String pan) {
       return null;
    }


    public Account createAccountCorporate(String gst, String pan) {
       return null;
    }
}
