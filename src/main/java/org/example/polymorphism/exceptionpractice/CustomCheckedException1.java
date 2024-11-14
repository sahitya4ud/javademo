package org.example.polymorphism.exceptionpractice;

public class CustomCheckedException1 extends Exception {

    public String errorCode;

    public CustomCheckedException1(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
