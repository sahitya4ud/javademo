package org.example.polymorphism.abstractdemo;

import org.example.polymorphism.Payment;
import org.example.polymorphism.PaymentStatusEnum;
import org.example.polymorphism.customcheckedexception.InsufficientBalanceException;
import org.example.polymorphism.enumdemo.TransferEnum;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiPredicate;
import java.util.function.Function;



public abstract class SbiTransferService implements RBIPayment{

    protected abstract boolean transactionLimitCheck(Account account, Double amount);



        public  static Map<String,Account>  accountMap = new HashMap<>();

        public static Map<String,Transaction> accountTransactionMap = new HashMap<>();

        BiPredicate<String,Double>balanceCheck = (accountNumber, amt) -> {
            Account accountBalance = SBIAccountDBService.accountMap.get(accountNumber);
            if (accountBalance != null && accountBalance.getBalance() > amt) {
                return true;


            } else {
                return false;
            }
        };
            public Boolean balanceCheck(String accountNumber,Double amount){
                Account accountBalance = SBIAccountDBService.accountMap.get(accountNumber);
                if(accountBalance != null && accountBalance.getBalance()> amount){
                    return true;


                }else {
                    return false;
                }
            }




              Function<Double,Payment> errorSupplier = (amount)->{
                  Payment p = new Payment();
                  p.setStatus(PaymentStatusEnum.FAILED.getLabel());
                  p.setTransactionId(UUID.randomUUID().toString());
                  p.setUter(UUID.randomUUID().toString());
                  p.setTransactionDate(new Date());
                  p.setAmount(amount);
                  return p;
              };




        @Override
        public Payment transfer(String fromAccount, String toAccount, Double amount) throws InsufficientBalanceException {

            Payment p = new Payment();
            if (balanceCheck.test(fromAccount, amount)) {
                Account account = SBIAccountDBService.accountMap.get(fromAccount);
                if (this.transactionLimitCheck(account, amount)) {
                    p.setStatus(PaymentStatusEnum.SUCCESS.getLabel());
                    p.setTransactionId(UUID.randomUUID().toString());
                    p.setUter(UUID.randomUUID().toString());
                    p.setTransactionDate(new Date());
                    p.setAmount(amount);
                    return p;

                }
            } else {
                throw new InsufficientBalanceException(TransferEnum.INSUFFICIENT_BALANCE.getCode(),TransferEnum.INSUFFICIENT_BALANCE.getLabel());
            }
            if(true){
                System.out.println("even this if is executed even after insufficient balance as well");
            }
            return p;
        }
    }

