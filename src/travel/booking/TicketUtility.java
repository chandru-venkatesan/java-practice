package travel.booking;

public class TicketUtility {
    public static  int countBookings(Ticket[] arr,int index){
        if(index== arr.length) return 0;
        if(arr[index]==null) return countBookings(arr, index+1);
        return 1+countBookings(arr,index+1);
    }
}
