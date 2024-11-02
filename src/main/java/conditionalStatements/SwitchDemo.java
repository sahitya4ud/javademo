package conditionalStatements;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the values");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("balance enquiry");
            case 2:
                System.out.println("debt information");
            case 3:
                System.out.println("credit information");
            default:
                System.out.println("please enter the valid key");
        }
    }
}
