package org.example.polymorphism.websitedemo;

public class WebSiteTest {
    public static void main(String[] args) {
        AngularWebsite angularWebsitePaymentPage= new PaymentPage("payment page");//method declared in super class

        System.out.println(angularWebsitePaymentPage.page());
        System.out.println(angularWebsitePaymentPage.i);//child


        PaymentPage paymentPage= new PaymentPage("payment page");

        System.out.println(paymentPage.page());
        System.out.println(paymentPage.i);//subclass
        System.out.println(paymentPage.j);//subclass reference

       AngularWebsite angularWebsite= new AngularWebsite("payment page");//super class

        System.out.println(angularWebsite.page());
        System.out.println(angularWebsite.i);//superclass


    }
}
