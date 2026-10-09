package datetime_exception_custom_handling;

import java.time.LocalDate;
import java.util.Scanner;

public class MovieTicketBooking {
    static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Booking Date in YYYY-MM-DD Format: ");
        String date = sc.nextLine();
        try {
            LocalDate bookingDate = LocalDate.parse(date);
            if(bookingDate.isAfter(today)){
                System.out.println("Booking Confirmed for "+bookingDate);
            }
            else{
                System.out.println("Invalid date . Please choose future Date");
            }

        }
        catch(Exception e){
            System.out.println("Invalid Input");
        }
    }

}