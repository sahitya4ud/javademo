package org.example.polymorphism.abstractdemo;

import org.example.polymorphism.Payment;

public class NEFTSBITransferServiceImpl extends SbiTransferService{
    @Override
    protected boolean transactionLimitCheck(Account account, Double amount) {
        System.out.println("Validating transactionalLimitCheck for account in NEFTSBITransferServiceImpl" + account.getAccount());
        if (amount < 1000000)
            return true;
        else {
            return false;
        }
    }


}
