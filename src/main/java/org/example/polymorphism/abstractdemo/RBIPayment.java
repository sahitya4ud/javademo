package org.example.polymorphism.abstractdemo;

import org.example.polymorphism.Payment;

public interface RBIPayment {
    Payment transfer(String fromAccount, String toAccount, Double amount);

}
