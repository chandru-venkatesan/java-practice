package travel.booking;

import java.time.LocalDate;

public class TrainTicket extends Ticket {
    TrainTicket(String passengerName, double price, LocalDate dateOfTravel) {
        super(passengerName, price, dateOfTravel);
    }

    @Override
    void printTicket() {
        System.out.println("TRAIN TICKET DETAILS");
        System.out.println("PassengerName "+passengerName);
        System.out.println("Ticket Price in Rs. "+price);
        System.out.println("Date of Travel is "+dateOfTravel);
    }
}
