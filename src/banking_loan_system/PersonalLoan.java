package banking_loan_system;

public class PersonalLoan extends Loan {
    PersonalLoan(double amount, double interestRate){
        super(LoanType.PERSONAL,amount,interestRate);
    }
    double calculateEMI() {
        double personalloanEMI=(amount*(interestRate/12)/100);
        double proceesingFee=1000.00;
        return personalloanEMI+(proceesingFee/12);
    }
    public boolean isEligible(double salary){
        return salary >30000;
    }
}
