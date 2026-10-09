package basics.a1;

import java.util.Scanner;

public class BusTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        int seatnumber;
        while (true) {
            System.out.println("Enter seat number to book 1-10 or 0 to Exit");
            seatnumber = sc.nextInt();
            if (seatnumber == 0) {
                System.out.println("Exiting");
                break;
            }
            if (seatnumber > 10) {
                System.out.println("Invalid Seatnumber. Exiting");
                break;
            }
            if (seats[seatnumber - 1]) {
                System.out.println("Seat already Booked");
                continue;
            }

            seats[seatnumber - 1] = true;
            System.out.println("Seat Booking Status : Successfull");
        }
        System.out.println("Final Seat Status");
        for(int i=0;i<seats.length;i++){
            if(seats[i]){
                System.out.println("Seat "+(i+1) +  ": Booked");
            }
            else{
                System.out.println("Seat "+(i+1) +  ": Empty");
            }
        }
        sc.close();

    }
}