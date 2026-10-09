package travel.booking;

import java.time.LocalDate;

public class FlightTicket extends Ticket {
       Meal meal;
    FlightTicket(String passengerName, double price ) {
        super(passengerName, price );
        this.meal = new Meal("Standart Meal");
    }
    FlightTicket(String passengerName, double price, LocalDate date,String mealPreference) {
        super(passengerName, price, date);
        this.meal = new Meal(mealPreference);
    }



    class Meal{
        String mealType;

        Meal(String mealType){
            this.mealType = mealType;
        }
        void  printMeal(){
            System.out.println("Meal Preference : "+ mealType);
        }
    }

    @Override
    void printTicket() {
        System.out.println("FLIGHT TICKET DETAILS");
        System.out.println("PassengerName "+passengerName);
        System.out.println("Ticket Price in Rs. "+price);
        System.out.println("Date of Travel is "+dateOfTravel);
        meal.printMeal();
    }

}
