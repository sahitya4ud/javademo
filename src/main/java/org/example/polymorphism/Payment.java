package org.example.polymorphism;

import java.util.Date;

public class Payment {

    private String transactionId;
     private  String uter;

     private String status;
     private Date transactionDate;
    public  static double limitCount;
    private String amount;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUter() {
        return uter;
    }

    public void setUter(String uter) {
        this.uter = uter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;

    }

    public static double getLimitCount() {
        return limitCount;
    }

    public static void setLimitCount(double limitCount) {
        Payment.limitCount = limitCount;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
