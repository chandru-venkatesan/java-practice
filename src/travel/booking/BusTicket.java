package travel.booking;

import java.time.LocalDate;

public class BusTicket extends Ticket {
    BusTicket(String passengerName, double price) {
        super(passengerName, price);
    }
    BusTicket(String passengerName,double price, LocalDate date){
        super(passengerName, price, date);
    }

    @Override
    void printTicket() {
        System.out.println("BUS TICKET DETAILS");
        System.out.println("PassengerName "+passengerName);
        System.out.println("Ticket Price in Rs. "+price);
        System.out.println("Date of Travel is "+dateOfTravel);
    }
}
