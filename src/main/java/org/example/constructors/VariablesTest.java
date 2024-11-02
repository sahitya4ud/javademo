package org.example.constructors;

public class VariablesTest {
    public static void main(String[] args) {
        Variables variables = new Variables();
        System.out.println("variable "+variables.getInstanceNumber()+1);
        Variables variables1= new Variables();
        System.out.println(" variable1 "+variables1.getInstanceNumber()+1);
      // Variables variables2 = Variables.getStaticNumber();//
    }
}
