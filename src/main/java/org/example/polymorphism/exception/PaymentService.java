package org.example.polymorphism.exception;

import org.example.polymorphism.customcheckedexception.InsufficientBalanceException;
import org.example.polymorphism.enumdemo.TransferEnum;

public class PaymentService {
    static int seats =10;

    public String payment(int numberOfTickets) throws InsufficientBalanceException{
        try{
            if(numberOfTickets >5){
                throw new InsufficientBalanceException(TransferEnum.INSUFFICIENT_BALANCE.getCode(),TransferEnum.INSUFFICIENT_BALANCE.getLabel());
            }

        }catch (InsufficientBalanceException e){
            System.out.println("Exception InsufficientBalanceException occured"+e);
            throw e;
        }catch(Exception e){
            System.out.println("Exception occured"+e);
            throw e;
        }
        return "SUCCESS";
    }
}
