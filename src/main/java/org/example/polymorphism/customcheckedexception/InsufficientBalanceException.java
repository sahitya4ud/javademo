package org.example.polymorphism.customcheckedexception;

public class InsufficientBalanceException extends Exception {


    private String code;
    private String message;
    private Throwable throwable;


    public InsufficientBalanceException(String code, String message, Throwable throwable) {

        super(message, throwable);
        this.code = code;


    }

    public InsufficientBalanceException(String code, String message) {

        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
