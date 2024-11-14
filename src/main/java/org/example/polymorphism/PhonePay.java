package org.example.polymorphism;

import java.util.*;
import java.util.function.BiPredicate;


public class PhonePay implements UPIPayments {
 public  static  Map<String,Double> accountBalanceMap = new HashMap<>();
 public static   Map<String, List<Payment>>paymentHistoryMap = new HashMap<>();


    static {
        accountBalanceMap.put("3162008030",10000.0);
        accountBalanceMap.put("123456",5000.0);
        paymentHistoryMap.put("3162008030", new ArrayList<>());
        paymentHistoryMap.put("123456", new ArrayList<>());

    }
    BiPredicate<String,Double>balanceCheck = (accountNumber,amt)-> {
        Double accountBalance = accountBalanceMap.get(accountNumber);
        if(accountBalance>amt) {
            return true;
        }else{
            return false;

        }
    };



       @Override
        public Payment transfer(String fromMobileNumber, String toNumber, Double amount) {

           Payment p = new Payment();



          if  (balanceCheck.test(fromMobileNumber,amount))  {



        Double fromAccountBalance = accountBalanceMap.get(fromMobileNumber);
        Double toAccountBalance = accountBalanceMap.get(toNumber);

        Double fromTotalBalance = fromAccountBalance-amount;
        Double toTotalBalance = toAccountBalance+amount;

        accountBalanceMap.put(fromMobileNumber,fromTotalBalance);
        accountBalanceMap.put(toNumber,toTotalBalance);
              p.setStatus(PaymentStatusEnum.SUCCESS.getLabel());
              p.setTransactionId(UUID.randomUUID().toString());
              p.setUter(UUID.randomUUID().toString());
              p.setTransactionDate(new Date());
              p.setAmount(amount);


    }else {

        p.setStatus(PaymentStatusEnum.FAILED.getLabel());
        p.setTransactionId(UUID.randomUUID().toString());
        p.setUter(UUID.randomUUID().toString());
        p.setTransactionDate(new Date());

    }



           return p;

    }


}
