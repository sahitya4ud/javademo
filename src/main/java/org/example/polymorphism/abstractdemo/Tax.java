package org.example.polymorphism.abstractdemo;

public class Tax {

    private String pan;
    private Double amount;
    private Double usedAmount;
    private String accountNmuber;

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getUsedAmount() {
        return usedAmount;
    }

    public String getAccountNmuber() {
        return accountNmuber;
    }

    public void setAccountNmuber(String accountNmuber) {
        this.accountNmuber = accountNmuber;
    }

    public void setUsedAmount(Double usedAmount) {
        this.usedAmount = usedAmount;

    }
}
