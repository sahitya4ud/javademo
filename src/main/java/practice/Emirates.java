package practice;

import java.io.IOException;

public class Emirates<S> implements FlightBooking<S>{
    @Override
    public void bookingSeats(S a) throws RuntimeException {
        System.out.println("Booking successfull");
    }

  //  @Override
//    public void payment() throws Throwable{
//        System.out.println("Payment successfull");

//    }
}
