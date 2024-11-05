package org.example.polymorphism.abstractdemo;

import java.util.ArrayList;

public class BeneficiaryService {


    Beneficiary addBeneficiary(Beneficiary beneficiary){
        ArrayList<Beneficiary>beneficiaryArrayList = SBIAccountDBService.accountBeneficiaryMap.get(account.getAccount());
        if(beneficiaryArrayList != null) {
            beneficiaryArrayList.add(beneficiary);

        } else {
            beneficiaryArrayList = new ArrayList<Beneficiary>();
            beneficiaryArrayList.add(beneficiary);
            SBIAccountDBService.accountBeneficiaryMap.put(account.getAccount(),beneficiaryArrayList);
        }
        return beneficiary;
    }
}
