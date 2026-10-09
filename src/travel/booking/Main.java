package travel.booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket[] bookings = new Ticket[20];
        int index = 0;
        while (true) {
            System.out.println("TRAVEL BOOKING MENU:");
            System.out.println("1.Book Flight");
            System.out.println("2.Book Train");
            System.out.println("3.Book Bus");
            System.out.println("4. Show all tickets");
            System.out.println("5. Count total Bookings");
            System.out.println("6. Exit");
            System.out.println("Enter Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 6) {
                System.out.println("Exiting System...");
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid input. Try again...");
            }

            if (choice == 4) {
                System.out.println("All Bookings:");
                for (Ticket t : bookings) {
                    if (t != null) {
                        t.printTicket();
                    }
                }
            }
            if(choice==5){
                int total= TicketUtility.countBookings(bookings,0);
                System.out.println("Total bookings :"+total);
            }

            System.out.println("Enter Passenger Name: ");
            String name =sc.nextLine();

            System.out.println("Enter price:");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter Travel date in (dd-MM-yyyy) Format :");
            String dateStr = sc.nextLine();
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(dateStr,df);
            Ticket ticket = null;

            switch (choice){
                case 1:
                    System.out.println("Enter Meal Preference:");
                    String meal = sc.nextLine();
                    ticket = new FlightTicket(name,price,date,meal);
                    break;

                case 2:
                    ticket= new BusTicket(name,price,date);
                    break;

                case 3:
                    ticket =new TrainTicket(name,price,date);
                    break;
            }

            System.out.println("Enter Discount Percentage:");
            double percentage = sc.nextDouble();
            sc.nextLine();

            ticket.applyDiscount(percentage);

            bookings[index++]= ticket;
            System.out.println("Ticket Booked successFully!");
        }

    }

}
