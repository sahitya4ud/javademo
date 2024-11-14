package org.example.polymorphism.exception;

public class ExceptionDemoTest {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World");

            ExpectionTest test = new ExpectionTest();
            test.calculate();
            System.out.println("I am done calculation");
        } catch (Exception e) {
       e.printStackTrace();
        }
        System.out.println("Post Exception handling iam done calculation");
    }
}
