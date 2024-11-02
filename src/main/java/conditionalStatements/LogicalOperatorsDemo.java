package conditionalStatements;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        String username="sah@gmail.com";
        String password="has123@";
        if(username.equals("sah@gmail.com")&& password.equals("has123@")) {
            System.out.println("login successfull");
        }else {
            System.out.println("enter valid credentials");
        }


    }
}
