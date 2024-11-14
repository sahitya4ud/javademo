package org.example.polymorphism.abstractdemo;

public class PensionTaxTransferServiceImpl extends SbiTransferService{
 @Override
    public Boolean balanceCheck(String accountNumber,Double amount) {
     Tax t = TaxServiceImpl.taxMap.get(accountNumber);
     if (t != null) {
         Double eligibleAmount = t.getAmount() * 20 / 100;
         if (amount < eligibleAmount) {
             return true;
         }
     }
     return false;
 }
    @Override
    protected boolean transactionLimitCheck(Account account, Double amount) {

        System.out.println("Validating transactionLimitCheck for account PensionTaxTransaction");
        return false;
    }
}
