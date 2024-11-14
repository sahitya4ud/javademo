package org.example.polymorphism.websitedemo;

public class PaymentPage extends AngularWebsite{

    public int i=30;

    public int j=40;

    public void subTestWithSuperRef(){

    }

    public PaymentPage(String pageurl) {
        super(pageurl);
    }

    @Override
    public String header() {
        return super.header()+"Payment page";
    }
    @Override
    public String footer() {
        return "footer page for payment";
    }
    @Override
    public String body() {
        return "from payment body page";
    }
}
