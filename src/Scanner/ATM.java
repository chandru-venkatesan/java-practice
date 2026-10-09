package Scanner;

import java.util.Scanner;

public class ATM {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial Amount: ");
        double balance = sc.nextDouble();
        System.out.println("Choose option");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("Enter choice: ");
        int choice = sc.nextInt();
         switch (choice){
             case 1:
                 System.out.println("Balnce Amount: "+ balance);
                 break;
             case 2:
                 System.out.println("Enter Deposit Amount: ");
                 double deposit = sc.nextDouble();
                 balance = balance+ deposit;
                 System.out.println("New Balance: " + balance);
                 break;
             case 3:
                 System.out.println("Enter Withdraw Amount: ");
                 double withdraw = sc.nextDouble();
                 if(withdraw<=balance){
                     balance = balance - withdraw;
                     System.out.println("New balance : "+ balance);
                 }
                 else{
                     System.out.println("Insuffiecient Balance");
                 }
                 break;
             default:
                 System.out.println("Invalid Choice");

         }
    }
}
