package banking_loan_system;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Loan[] loans = new Loan[5];
        int loanindex=0;
        while(true){
            System.out.println("LOAN MENU");
            System.out.println("1. Apply Home Loan");
            System.out.println("2. Apply Personal Loan");
            System.out.println("3. Apply Education Loan");
            System.out.println("4. Show Total Loan Amount");
            System.out.println("5.Exit");
            System.out.println("Enter Chioce");
            int choice = sc.nextInt();
            if(choice==5){
                System.out.println("Exiting");
                break;
            }
            if (choice<1 || choice>5){
                System.out.println("Invalid Data");
                continue;
            }
            if(choice==4){
                double total = Utility.totalLoanAmount(loans,0);
                System.out.println("Total Loan Amount : "+ total);
                continue;
            }
            System.out.println("Enter Monthly Salary");
            double salary = sc.nextDouble();
            System.out.println("Enter Loan Amount");
            double amount = sc.nextDouble();
            System.out.println("Enter Interest Rate");
            double rate = sc.nextDouble();
            Loan loan = null;
            switch (choice){
                case 1:
                     loan = new HomeLoan(amount, rate);
                    break;
                case 2:
                    loan = new PersonalLoan(amount,rate);
                    break;
                case 3:
                    loan = new EducationLoan(amount,rate);
                    break;
            }
            if(loan.isEligible(salary)){
                System.out.println("Not eligible");
                continue;
            }
            System.out.println("Your EMI: "+loan.calculateEMI());
            loans[loanindex++]= loan;
            System.out.println("Loan Added Successfully");
        }
        sc.close();
    }
}
