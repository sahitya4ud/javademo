package org.example.polymorphism.exception;

public enum PaymentEnum {
    INSUFFICIENT_BALANCE("TS_100","Insufficient balance in your account %s");

    private String code;
    private String label;

    PaymentEnum(String code,String label) {
        this.code=code;
        this.label=label;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
