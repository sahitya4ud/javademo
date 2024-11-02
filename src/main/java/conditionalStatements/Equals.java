package conditionalStatements;

public class Equals {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 100;
        if (num1 == num2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        String n = "sahitya";
        String n1 = "sahitya";
        String name = new String("sahitya");
        String name1 = new String("sahitya");


        System.out.println(n.equals(name1));


    }
}