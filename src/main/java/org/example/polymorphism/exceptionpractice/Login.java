package org.example.polymorphism.exceptionpractice;

public class Login {
    public String userName="admin";
    public String password="password";

    public String login(String user,String pass)throws CustomCheckedException1{

        if(userName.equals(user)&&password.equals(pass)){
            System.out.println("valid credentials");
        }else{
            throw new CustomCheckedException1(ErrorStatus.ERROR.getErrorMessage(), ErrorStatus.ERROR.getErrorCode());
        }
        return "";
    }
}
