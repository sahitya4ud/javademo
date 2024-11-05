package org.example.polymorphism.abstractdemo;

    public class RTGSSBITransferServiceImpl extends SbiTransferService {


        @Override
        protected boolean transactionLimitCheck(Account account, Double amount) {
            System.out.println("Validating transactionLimitCheck for account" + account.getAccount());

            if(amount>200000 && amount<1000000)

                return  true;
            else{
                return false;
        }
        }
    }

