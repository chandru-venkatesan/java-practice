package banking_loan_system;

public abstract class Loan {
    LoanType type;
    double amount;
    double interestRate;
    Loan(LoanType type,double amount,double interestrate){
        this.type= type;
        this.amount= amount;
        this.interestRate = interestrate;
    }
    abstract double calculateEMI();

    public boolean isEligible(double salary) {
        return false;
    }
}
