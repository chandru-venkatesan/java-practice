package basics.a1;

import java.util.Scanner;

public class AtmMenu {
    static int balance =10000;
    public static void transaction(int amount){
        balance = balance+amount;
        System.out.println("Deposited "+ amount+ " in your Account.Your new Balance is "+balance );
    }
    public static void transaction(int amount, boolean isWithdraw){
        if(amount>balance){
            System.out.println("Insufficient Balance!");
        }
        else{
            balance=balance-amount;
            System.out.println("Withdrawn "+ amount+ " from your  ccount. Your Balance is "+balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Current Balance: "+ balance);
                    break;
                case 2:
                    System.out.println("Enter Amount to Deposit: ");
                    int depositAmount = sc.nextInt();
                    transaction(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter Amount to Withdraw:");
                    int withdrawAmount = sc.nextInt();
                    transaction(withdrawAmount,true);
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid, Try Again");
                    continue;

            }
        } while (choice != 4);
    }
}
