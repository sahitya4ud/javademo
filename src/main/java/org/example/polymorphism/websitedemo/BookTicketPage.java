package org.example.polymorphism.websitedemo;

public class BookTicketPage extends AngularWebsite {

    public BookTicketPage(){


        this("bookTicketpage");
    }
    public BookTicketPage(String name){
        super(name);
    }
    @Override
    public String body() {
        return "body";
    }
}
