package conditionalStatements;

public class Elseifcondition {
    public static void main(String[] args) {
       int gst = 9;
       if(gst < 3) {
           System.out.println("no tax");
       }else if(gst == 5){
           System.out.println("pay 5% tax");
       }else if(gst >= 9){
           System.out.println("pay 10% tax");
       }else{
           System.out.println("return to the sataement");
       }
    }
}
