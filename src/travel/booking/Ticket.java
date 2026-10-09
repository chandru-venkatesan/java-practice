package travel.booking;

import java.time.LocalDate;

public abstract class Ticket implements Discountable{
    String passengerName;
    double price;
    LocalDate dateOfTravel;
    Ticket(String passengerName,double price){
        this.passengerName=passengerName;
        this.price=price;
        this.dateOfTravel=LocalDate.now();
    }

    Ticket(String passengerName , double price, LocalDate date){
        this.passengerName= passengerName;
        this.price=price;
        this.dateOfTravel=date;
    }

    abstract void printTicket();

    @Override
    public double applyDiscount(double percentage) {
        price = price-(price*(percentage/100));
        return price;
    }
}
