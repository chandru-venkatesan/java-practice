package banking_loan_system;

public class EducationLoan extends Loan{
    EducationLoan(double amount, double interestRate){
        super(LoanType.EDUCATION,amount,interestRate);
    }

    @Override
    double calculateEMI() {
        double lowestinterest=6.00;
        return (amount*(lowestinterest/12)/100);
    }
    public boolean isEligible(double salary){
        return salary >10000;
    }
}
