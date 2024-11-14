package org.example.polymorphism.exceptionpractice;

public class CustomCheckedException extends Exception {



    public String errorCode;

    public CustomCheckedException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

}
