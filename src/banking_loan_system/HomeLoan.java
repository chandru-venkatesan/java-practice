package banking_loan_system;

public class HomeLoan  extends Loan {
    HomeLoan(double amount, double interestRate){
        super(LoanType.HOME,amount,interestRate);
    }
    @Override
    double calculateEMI() {
        double homeloanEMI=(amount*(interestRate/12)/100);
        double propertyTax =1000.00;
        return homeloanEMI+(propertyTax/12);
    }
     public boolean isEligible(double salary){
         return salary >50000;
     }
}
