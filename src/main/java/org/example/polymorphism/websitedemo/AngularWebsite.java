package org.example.polymorphism.websitedemo;

public  class AngularWebsite implements Website {
    public int i =10;

private String url;
public AngularWebsite(String pageurl){
    this.url=pageurl;
}

    @Override
    public String header() {
        return "header";
    }

    @Override
    public String footer() {
        return "footer";
    }
    public  String body(){
        System.out.println("body from super class");
        return "body from super";
    }

    public String page(){
        StringBuilder builder = new StringBuilder();
        builder.append(header());
        builder.append(body());
        builder.append(footer());
        return builder.toString();

    }
}
