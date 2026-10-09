package banking_loan_system;

public class Utility {
    public static double totalLoanAmount(Loan[] loans, int index){
        if(index== loans.length){
            return 0;
        }
        if(loans[index]== null){
           return totalLoanAmount(loans, index+1);
        }
        return loans[index].amount + totalLoanAmount(loans, index+1);
    }
}
