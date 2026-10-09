package hospital.management;

public class AppointmentBookingThread extends Thread{

    @Override
    public void run() {
        System.out.println("Booking Appointment for "+currentThread().getName());
    }
}
