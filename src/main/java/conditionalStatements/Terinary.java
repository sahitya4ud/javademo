package conditionalStatements;

import java.util.Scanner;

public class Terinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the values");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int result = number1>number2 ? number1:number2;
    }
}
