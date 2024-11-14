package org.example.polymorphism.abstractdemo;

import org.example.polymorphism.Payment;
import org.example.polymorphism.customcheckedexception.InsufficientBalanceException;

public interface RBIPayment {
    Payment transfer(String fromAccount, String toAccount, Double amount) throws InsufficientBalanceException;

}
