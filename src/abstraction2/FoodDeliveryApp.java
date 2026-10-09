package abstraction2;

public abstract class FoodDeliveryApp {
     String appName;
     double deliveryCharge;
     abstract void placeOrder();
     void showDetails(){
         System.out.println("App Name: "+ appName);
         System.out.println("Delivery Charge: "+ deliveryCharge);
     }

}
