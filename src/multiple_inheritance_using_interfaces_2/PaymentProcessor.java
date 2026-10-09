package multiple_inheritance_using_interfaces_2;

public class PaymentProcessor implements UPI,CardPayment{

    @Override
    public void processUPITransaction() {
        System.out.println( "UPI Transaction successful!");
    }

    @Override
    public void processCardPayment() {
        System.out.println("Card Payment Approved!");
    }
}
