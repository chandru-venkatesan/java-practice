package datetime_exception_custom_handling;

import java.util.Scanner;

public class BankLoanEligibility extends Exception {
    public BankLoanEligibility(String Message){
        super(Message);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary:");
        int salary = sc.nextInt();
        System.out.println("Enter credit  Score: ");
        int cs = sc.nextInt();
        try{
            if(salary<30000 || cs<700){
                throw new Exception("Loan Eligibility Exception: You are not eligible for the Loan!");
            }
            else{
                System.out.println("Eligible for Loan");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
