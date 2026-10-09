package hospital.management;

public class AppointmentLimitExceededException extends RuntimeException {
    public AppointmentLimitExceededException(String message) {
        super(message);
    }
}
