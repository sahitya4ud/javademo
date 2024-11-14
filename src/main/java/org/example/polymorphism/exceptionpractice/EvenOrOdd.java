package org.example.polymorphism.exceptionpractice;

public class EvenOrOdd {
    public int validateEvenOrOdd(int number) throws CustomCheckedException{
        if(number%2==0){
            System.out.println("entered number is even:"+number);
        }else{
            throw new CustomCheckedException(ErrorStatus.ERROR.getErrorMessage(), ErrorStatus.ERROR.getErrorCode());
        }
        return number;
    }
}
