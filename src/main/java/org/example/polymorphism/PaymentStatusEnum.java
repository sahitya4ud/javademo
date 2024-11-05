package org.example.polymorphism;

public enum PaymentStatusEnum {

    SUCCESS(   "Transaction is success"),
    FAILED(     "Transaction is failed"),
    PENDING(    "Transaction is in-progress"),
    lIMIT_EXCEED(" payment failed due to limit exceed");
    private String label;

    PaymentStatusEnum(String  label) {
        this.label=label;
    }


    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

