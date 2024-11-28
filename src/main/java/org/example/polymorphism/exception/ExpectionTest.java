package org.example.polymorphism.exception;

public class ExpectionTest {
    public void calculate() {
        try {
            A a = (A) Class.forName("org.example.polymorphism.exception.A").newInstance();
            a.test();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Expection occured while calculating" + e.getMessage());
        }
    }


    public void calculateWithThrows() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {

            A a = (A) Class.forName("com.neo.workshop.polymorphism.exception.A").newInstance();
            a.test();

        } catch (RuntimeException e) {
            System.out.println("Exception occured while calculating" + e.getMessage());
        }
    }

    public void calculateWithThrow() {
        try {
            A a = (A) Class.forName("com.neo.workshop.polymorphism.exception.A").newInstance();
            a.test();
        } catch (Exception e) {
            System.out.println("Exception occured while calculating" + e.getMessage());
            throw new RuntimeException("Class loading issue");
        } finally {
            System.out.println("from finally");
        }
    }

    public void calculateWithfinally() throws Exception {
        try {
            A a = (A) Class.forName("com.neo.workshop.polymorphism.exception.A").newInstance();
            a.test();

        } finally {
            System.out.println("from finally calculateWithfinally1111");

        }}
       public void calculateWithfinally(int numberofTicket){
            String status = null;
            try{
                System.out.println("Available"+PaymentService.seats);
                PaymentService.seats=PaymentService.seats-numberofTicket;
                System.out.println("Available"+PaymentService.seats);
                PaymentService paymentService=new PaymentService();
//                status = paymentService.payment(numberofTicket);
            }finally{
                if(!"SUCCESS".equals(status)){
                    PaymentService.seats= PaymentService.seats+numberofTicket;
                }
                System.out.println("from finally calculateWithfinally1111");
                System.out.println("post payment Available"+PaymentService.seats);
            }
        }
//        System.out.println("post finally block");
//    }
}