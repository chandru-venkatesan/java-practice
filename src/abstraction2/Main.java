package abstraction2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodDeliveryApp app;
        System.out.println("Choose your Food Delivery App:");
        System.out.println("1.Zomato");
        System.out.println("2.Swiggy");
        int choice = sc.nextInt();
        if(choice==1){
            app = new Zomato();
            app.appName ="Zomato";
            app.deliveryCharge = 200.00;
        } else if (choice == 2) {
            app= new Swiggy();
            app.appName="Swiggy";
            app.deliveryCharge = 250.00;
        }
        else{
            System.out.println("Invalid Option");
            return;
        }
        app.showDetails();
        app.placeOrder();


    }
}
