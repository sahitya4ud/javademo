package org.example.polymorphism.exceptionpractice;

public enum ErrorStatus {

    ERROR("0","Invalid number"),
    VALID("1","valid number");

private String errorCode;
private String errorMessage;

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    ErrorStatus(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;

    }
}
