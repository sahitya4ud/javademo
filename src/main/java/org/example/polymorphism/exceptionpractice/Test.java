package org.example.polymorphism.exceptionpractice;

public class Test {
    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        try {

            int result = evenOrOdd.validateEvenOrOdd(9);
        } catch (CustomCheckedException customCheckedException) {

        }
        System.out.println("customCheckedException");
        Login login = new Login();
        try {
            login.login("A", "password");

        } catch (CustomCheckedException1 customException1) {
            System.out.println("CustomCheckedException1    " + customException1.getMessage());
        }


    }

}
