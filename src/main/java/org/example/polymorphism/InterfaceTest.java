package org.example.polymorphism;

public class InterfaceTest {
    public static void main(String[] args) {
        UPIPayments payments = new PhonePay();
        Payment pay = payments.transfer("3162008030","123456",3000.0);
        Payment pay1 = payments.transfer("3162008030","123456",30000.0);
        Payment pay2  = payments.transfer("3162008030","123456",-100.0);
        System.out.println(pay.getTransactionId()+" status"+pay.getStatus()+"  uter"+pay.getUter()+"  Date"+pay.getTransactionDate());
        System.out.println("Balance of from account "+PhonePay.accountBalanceMap.get("3162008030"));
        System.out.println("To account Balance "+PhonePay.accountBalanceMap.get("123456"));
    }
}
