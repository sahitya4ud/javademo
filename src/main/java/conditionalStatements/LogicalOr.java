package conditionalStatements;

public class LogicalOr {
    public static void main(String[] args) {
        String text ="above 18";
        String text1 ="below 60";
        if(text.equals("above 18")||(text1.equals("below 60"))) {
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible to vote");

        }
        int age = 61;

        if(age>=18  &&  age<=60) {
            System.out.println("eligible for insurance");

        }else {
            System.out.println("not eligible for insurance");
        }
    }
}
