package multiple_inheritance_using_interfaces_2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Payment Method:");
        System.out.println("1. UPI Payment");
        System.out.println("2. Card Payment");
        int choice= sc.nextInt();
        PaymentProcessor PP = new PaymentProcessor();
        if (choice ==1){
            PP.processUPITransaction();
        } else if (choice==2) {
            PP.processCardPayment();
        }
        else {
            System.out.println("Invalid Option");
        }
    }
}
